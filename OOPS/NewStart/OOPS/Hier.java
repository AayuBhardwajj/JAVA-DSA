package OOPS;

class A{
    void prtA(){
        System.out.println("This is from A class");
    }
}
class B extends A{
    void prtB(){
        System.out.println("This is from B class");
    }
}
class C extends A{
    void prtC(){
        System.out.println("This is from C class");
    }
}

public class Hier{
    public static void main(String[] args) {
        C obj= new C();
        obj.prtA();
        obj.prtC();

    }
}
