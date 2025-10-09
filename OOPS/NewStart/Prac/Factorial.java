package NewStart.Prac;
import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the input for factorial: ");
        int input=s.nextInt();
        if(input<0){
            System.out.println("Invalid for negative");
        }
        System.out.println("The factorial of "+input+"is : "+findFactorial(input));
    }
    public static int findFactorial(int input){
        int x=1;
        for(int i=input;i>=1;i--){
            x*=i;
        }
        return x;
    }
}
