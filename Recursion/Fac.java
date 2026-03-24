package Recursion;

public class Fac {
    public static void main(String[] args){
        System.out.println(findFactorial(4));
    }

    public static int findFactorial(int n){
        if(n==1 ){
            return 1;
        }
        return n*findFactorial(n-1);
    }
}
