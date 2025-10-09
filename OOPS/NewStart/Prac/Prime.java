package NewStart.Prac;
import java.util.*;
public class Prime {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the input: ");
        int input= s.nextInt();
        boolean isPrime=true;
        if(input==2){
            System.out.println(input+" is a Prime Number");
        }
        else {
        for(int i=2;i<=Math.sqrt(input);i++){
            if(input%i==0){
                isPrime=false;
            }
        }
    }
        if(isPrime==true){
            System.out.println(input+" is a Prime Number");
        }
        else{
            System.out.println(input+" aint a Prime Number");
        }
    }
}
