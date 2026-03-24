package Recursion;

public class SumN {
    public static void main(String[] args){
        System.out.println(findSumOfNnumbers(5));
    }
    public static int findSumOfNnumbers(int a){
        if(a==1){
            return 1;
        }
        return a+findSumOfNnumbers(a-1);
    }
}
