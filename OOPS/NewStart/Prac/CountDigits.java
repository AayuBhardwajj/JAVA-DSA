package Prac;

public class CountDigits {
    public static void main(String[] args) {
        int digit=9277;
        countDig(digit);
    }
    public static void countDig(int digit){
        int x=0;
        int count=0;
        while(digit>0){
               digit=digit/10;
            count++;
        }
        System.out.println("Number of digits are: "+count);
    }
}
