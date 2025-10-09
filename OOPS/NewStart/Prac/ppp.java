class animal {
    void sound(){
        System.out.println("It makes a sound of pp");
    }
}
public class ppp extends animal{
    @Override
    void sound(){
        System.out.println("It doesn't makes a sound of pp");
    }


public static void main(String args[]){
    animal a1=new animal();
    a1.sound();

    ppp p1= new ppp();
    p1.sound();
}
}
