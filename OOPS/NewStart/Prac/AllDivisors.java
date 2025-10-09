package Prac;
import java.util.*;
public class AllDivisors {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number you wanna find divisors of: ");
        int num=s.nextInt();
        findAllDivisors(num);
    }
    public static void findAllDivisors(int num){
        for(int i=1;i<num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
