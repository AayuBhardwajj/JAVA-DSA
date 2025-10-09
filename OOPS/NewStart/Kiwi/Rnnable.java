class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hi");

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                System.out.println("x");
            }
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("hello");

            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                System.out.println("x");
            }
        }
    }
}

public class Rnnable {
    public static void main(String[] args) {
        Runnable obj= new A();
        Runnable obj1= new B();
        
        Thread t1= new Thread(obj);
        Thread t2= new Thread(obj1);

        t1.start();
        t2.start();
        }    
}
