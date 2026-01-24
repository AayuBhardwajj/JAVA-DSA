package BackTracking;
import java.util.*;
public class Grid {
    public static void main(String[] args){
      Scanner s= new Scanner(System.in);
      System.out.println("Enter the number of rows needed: ");
      int rows=s.nextInt();
      System.out.println("Enter the number of columns needed: ");
      int cols=s.nextInt();
      System.out.println("Number of ways for given input: "+findGrid(0, 0, rows, cols));
    }
    public static int findGrid(int i,int j, int rows, int cols){
        if(i==rows-1 && j==cols-1){
            return 1;
        }else if(i==rows|| j==cols){
            return 0;
        }
        return findGrid(i+1, j, rows, cols) + findGrid(i, j+1, rows, cols);
    }
}
