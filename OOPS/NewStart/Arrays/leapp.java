package NewStart.Arrays;
import java.util.*;
public class leapp {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter year: ");
        int year=s.nextInt();
       if((year%4==0 && year%400!=0)|| (year%400==0)){
        System.out.println("Yes, the year is a leap year");
       }
    }
}
 