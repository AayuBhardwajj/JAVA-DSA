package Arrays;
import java.util.*;
public class PascalT1 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Ente the row input: ");
        int row=s.nextInt();
        // System.out.println("Ente the column input: ");
        // int col=s.nextInt();

        long x=1;
        System.out.print(x+" ");
        for(int i=1;i<=row;i++){
            x=x*(row-i+1);
            x=x/i;
            System.out.print(x+" ");
        }

        }

}
