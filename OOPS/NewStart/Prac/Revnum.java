package Prac;

public class Revnum {
    public static void main(String[] args) {
        int num=9277;
        reverseTheNumber(num);
    }
    public static void reverseTheNumber(int num){
        int y=0;
        int x=0;
        while(num>0){
            y=num%10;
            x=(x*10)+y;
            num/=10;
        }
        System.out.println(x);
    }
}
