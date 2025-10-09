class A{
    public void show(){
        System.out.println("This is from Class A");
    }

    class B{
        public void show1(){
            System.out.println("This is from Class B");
        }
    }
}
public class Inner {
    public static void main(String[] args) {
        A obj= new A();
        obj.show();

        A.B obj1= obj.new B();
        obj1.show1();
    }
}
