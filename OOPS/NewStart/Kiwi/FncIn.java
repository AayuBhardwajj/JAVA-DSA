@FunctionalInterface
interface A{
    void show();
}
public class FncIn {
    public static void main(String[] args) {
        A obj =() ->System.out.println("It is from A");
        obj.show();
    }
}
