class A{
    void hello(){
        System.out.println("This is from Class A");
    }
}

class B extends A{
    void hello1(){
        System.out.println("This is from Class B");
    }
}
public class UpDown {
    public static void main(String[] args) {
        A obj= (A) new B();
        obj.hello();
    }
}
