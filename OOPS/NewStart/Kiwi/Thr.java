public class Thr {
    public static void main(String[] args) {
        int a=18;
        int b=0;

        try{
            b=a/b;
            if(b==0){
                throw new ArithmeticException ("Zero is not divisible");
            }
        } catch(ArithmeticException e){
            b=18/1;
            System.out.println("We handled it");
        }
        System.out.println(b);
    }
}
