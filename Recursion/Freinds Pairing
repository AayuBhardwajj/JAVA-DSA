import java.util.*;
public class FreindsPairing {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of freinds: ");
        int freinds=s.nextInt();
        System.out.println("Maximum possible ways freinds can be paired is: "+pairThem(freinds));
    }
    public static int pairThem(int freinds){
        if(freinds==1 || freinds==2){
            return freinds;
        }
        return pairThem(freinds-1)+(freinds-1)*pairThem(freinds-2);    
    }
}
