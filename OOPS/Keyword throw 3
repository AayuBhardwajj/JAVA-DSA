class myException extends Exception{
    public myException(){
        System.out.println("This exception is from my exception");
    }
}
public class Thr2 {
    public static void main(String[] args) {
        int a=20;
        int b=2;
        try{
            b=a-b;
            if(b==18){
                throw new myException();
            }
        } catch(myException e){
            System.err.println("This has been hadnled without any hastles");
        } 
    }
}
