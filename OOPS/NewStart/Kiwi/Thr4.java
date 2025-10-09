class add{
    public add(int a, int b) throws ArithmeticException {
        a=a/0;
    }
}

class subtract extends add{
    public subtract(int a, int b) throws ArithmeticException{
        super(a, b);
        b=a/0;
    }
}

public class Thr4{
    public static void main(String[] args) {
        try{
        subtract obj= new subtract(4, 5);

} catch(ArithmeticException e){
    System.out.println("KOi baat nahi");
}
    }
}