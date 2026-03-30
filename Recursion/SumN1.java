public class SumN1 {
    public static void main(String[] args){
        int a=6;
        System.out.println(printSum(a));
    }
    public static int printSum(int a){
        if(a==1){
            return 1;
        }
        return a+printSum(a-1);
    }
}
