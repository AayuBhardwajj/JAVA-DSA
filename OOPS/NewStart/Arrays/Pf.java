package Arrays;

public class Pf {

    public static double power(double x, int n) {
        double result = 1.0;
        long power = n;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {
            if ((power % 2) == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println(x + "^" + n + " = " + power(x, n));

        x = 2.0;
        n = -3;
        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}


