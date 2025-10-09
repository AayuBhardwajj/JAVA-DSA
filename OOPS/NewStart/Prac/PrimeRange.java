import java.util.*;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number till you wanna find the primes: ");
        int input= s.nextInt();
        findP(input);
    }
    public static boolean findPrime(int in){
        for(int i=2;i<=Math.sqrt(in);i++){
            if(in%i==0){
                return false;
            }
        }
        return true;
    }
    public static void findP(int input){
        System.out.println("The Prime Numbers from 2 to "+input+" are: ");
        for(int i=2;i<input;i++){
        if(findPrime(i)){
    
            System.out.print(i+" ");
        }
    }
    System.out.println();

}
}
