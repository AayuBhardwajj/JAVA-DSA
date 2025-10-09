package NewStart.Prac;
import java.util.*;
public class sec {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        do{
            System.out.println("Enter your integer input: ");
            int a= s.nextInt();
            if(a%10==0){
                continue;
            }
            System.out.println("The latest input you entered is: "+a);
        } while(true);
    }
}
