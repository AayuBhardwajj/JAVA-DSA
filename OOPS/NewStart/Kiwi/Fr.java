class Mobile{
    String brand;
    int price;
    static String Name;

    public void show(){
        System.out.println(brand+" : "+price+" : "+Name);
    }

    static{
        System.out.println("It is in static class");
    }
    public Mobile(){
        System.out.println("It is from constructor");
    }
}
public class Fr {
    public static void main(String[] args) {
        Mobile m1= new Mobile();
        m1.brand="vivo";
        m1.price=20000;
        m1.Name="Smart Phone";

        Mobile m2= new Mobile();
        Mobile.Name="Iphone";
        m2.price=100000;
        m2.brand="Apple";

        // m1.show();
        // m2.show();

        
    }
}
