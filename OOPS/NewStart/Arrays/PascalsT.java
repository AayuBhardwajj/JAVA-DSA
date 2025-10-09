package Arrays;
import java.util.*;
public class PascalsT {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the row number: ");
        int row=s.nextInt();
        System.out.println("Enter the column number: ");
        int col=s.nextInt();
        System.out.println("Element that would be present at index ' "+row+" , "+col+" ' is: "+findTheElement(row, col));
        

        
    }
    public static int findFactorial(int row){
        int x=1;
        for(int i=row;i>=1;i--){
            x*=i;
        }
        return x;
    }

    public static long findTheElement(int row, int col){
        long x=1;
        for(int i=0;i<col;i++){
            x*=(row-i);
            x/=(i+1);
        }
        return x;
    }
}
