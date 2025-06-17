class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
        System.out.println("Hi");
        try{
        Thread.sleep(10);
    } catch(InterruptedException e){
        System.out.println("Exception of Thread.sleep() method has been handled. Meanwhile the exception is: "+e);
    }
}
}
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
        try{
        Thread.sleep(10);
    } catch(InterruptedException e){
        System.out.println("Exception of Thread.sleep() method has been handled. Meanwhile the exception is: "+e);
    }
    }
}
}
public class Thrd2 {
    public static void main(String[] args) {
        A obj= new A();
        
        B obj1= new B();

        obj.start();
        try{
        Thread.sleep(5);
        } catch(InterruptedException e){
            System.out.println("ok");
        }
        obj1.start();;

    }
}
