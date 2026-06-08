package Placement;
import java.util.*;

public class UniquePaths {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of m: ");
        int m = in.nextInt();
        System.out.println("Enter the value of n ");
        int n = in.nextInt();

        System.out.println("Total unique paths are: "+findUniquePath(m, n));
        
        
    }
    public static int findUniquePath(int m, int n){
        return helper(0,0,m,n);
    }
    public static int helper(int i, int j, int m, int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>m || j>n || i<0 || j<0){
            return 0;
        }
        int left=helper(i+1, j, m, n);
        int right= helper(i,j+1, m, n);
        return left+right;
    }
}
