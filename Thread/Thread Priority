class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("hello");
        }
    }
}
public class Thrd1 {
    public static void main(String[] args) {
        A obj= new A();
        B obj1= new B();

        obj1.setPriority(Thread.MAX_PRIORITY);
        //System.out.println(obj1.getPriority());
        obj.start();
        obj1.start();
    }
}
