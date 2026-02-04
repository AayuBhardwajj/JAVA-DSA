import java.util.*;
public class AddT {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in); 
        System.out.println("Enter first input, this input will also be your input for even/odd : ");
        int a=s.nextInt();
        System.out.println("Enter second input: ");
        int b=s.nextInt();
        printNum(a, b);
        findEvenOdd(a);

    }
    public static void printNum(int a, int b){
        System.out.println(a+b);
    }
    public static void findEvenOdd(int a){
        if(a%2==0){
            System.out.println("Yes "+a+" is an even number");
        }else{
            System.out.println("It is an odd number");
        }
    }
}
