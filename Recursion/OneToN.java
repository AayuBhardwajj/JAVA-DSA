public class OneToN {
    public static void main(String[] args){
        printN(5);
    }
    public static void printN(int a){
        if(a==1){
            System.out.println("1");
            return;
        }
          System.out.println(a);
          printN(a-1);
    }
}
