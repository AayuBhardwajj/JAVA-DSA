package NewStart.Arrays;
import java.util.*;
public class Stonks {
 public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number of days for the calculation of stocks: ");
    int days=s.nextInt();
    int stDays[]= new int[days];
    System.out.println("Enter the prices of "+days+" days: ");
    for(int i=0;i<stDays.length;i++){
        stDays[i]=s.nextInt();
    }
    printDays(stDays);
    System.out.println();
    findProfit(stDays);

 }  
    public static void printDays(int stDays[]){
        for(int i=0;i<stDays.length;i++){
            System.out.println("Value of stock entered at day "+i+" is: "+stDays[i]);
        }
    } 
    public static void findProfit(int stDays[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProf=0;
        for(int i=0;i<stDays.length;i++){
            if(buyPrice>stDays[i]){
                buyPrice=stDays[i];
            }
            int profit=stDays[i]-buyPrice;
            maxProf=Math.max(maxProf, profit);
               
            
        }
        System.out.println("Maximum profit posible in given possible circumstances is : "+maxProf);

    }
}
