public class Print1toN{
    public static void main(String[] args) {
        int x=5;
        rec(x);
    }
    public static void rec(int x){
        if(x==0){
            return;
        }
        rec(x-1);
        System.out.println(x);

    }
}