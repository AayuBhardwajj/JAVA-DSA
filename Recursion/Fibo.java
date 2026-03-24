package Recursion;

public class Fibo {
    public static void main(String[] args){
        System.out.println(findFib(4));
    }
    public static int findFib(int x){
        if(x==0 || x==1){
            return x;
        }
        return findFib(x-1)+findFib(x-2);

    }
}
