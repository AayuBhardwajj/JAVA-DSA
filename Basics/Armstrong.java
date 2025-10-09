//package JAVA-DSA.Basics;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the input: ");
        int a= s.nextInt();
        checkForArmstrong(a);
    }
    public static void checkForArmstrong(int a){
        int dup=a;
        int sum=0;
        while(a>0){
            int lastDigit=a%10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            a/=10;
        }
        if(sum==dup){
            System.out.println("Yes, "+dup+" is definitely an Armstrong number");
        }else{
            System.out.println("No,it is not an armstrong number");
        }
    }
}
