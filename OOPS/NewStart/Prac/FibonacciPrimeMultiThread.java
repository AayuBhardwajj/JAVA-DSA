import java.util.Scanner;

class SharedData {
    int fibNumber = 0;
    boolean ready = false;
    boolean finished = false;
}

class FibonacciGenerator extends Thread {
    private final int n;
    private final SharedData shared;

    public FibonacciGenerator(int n, SharedData shared) {
        this.n = n;
        this.shared = shared;
    }

    public void run() {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            synchronized (shared) {
                while (shared.ready) {
                    try {
                        shared.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                shared.fibNumber = a;
                System.out.println("Fibonacci Number: " + a);
                shared.ready = true;
                shared.notify();
            }
            int next = a + b;
            a = b;
            b = next;
        }

        synchronized (shared) {
            shared.finished = true;
            shared.notify();
        }
    }
}

class PrimeChecker extends Thread {
    private final SharedData shared;

    public PrimeChecker(SharedData shared) {
        this.shared = shared;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public void run() {
        while (true) {
            synchronized (shared) {
                while (!shared.ready && !shared.finished) {
                    try {
                        shared.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (shared.finished && !shared.ready) {
                    break;
                }

                int num = shared.fibNumber;
                if (isPrime(num)) {
                    System.out.println("--> " + num + " is a Prime Number.");
                } else {
                    System.out.println("--> " + num + " is NOT a Prime Number.");
                }

                shared.ready = false;
                shared.notify();
            }
        }
    }
}

public class FibonacciPrimeMultiThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        SharedData shared = new SharedData();

        Thread fibThread = new FibonacciGenerator(n, shared);
        Thread primeThread = new PrimeChecker(shared);

        fibThread.start();
        primeThread.start();

        try {
            fibThread.join();
            primeThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
