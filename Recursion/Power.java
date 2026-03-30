public class Power {
    public static void main(String[] args){
        int a=2;
        int power=5;
        //findPower(a, power);
        System.out.println(findPower1(a, power));
    }
    public static void findPower(int a, int power){
        int x=1;
        for(int i=0;i<power;i++){
            x*=a;
        }
        System.out.println(x);
    }
    public static int findPower1(int a, int power){
        if(power==0){
            return 1;
        }
        return a*findPower1(a, power-1);
    }
}