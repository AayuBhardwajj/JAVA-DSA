package Recursion;
import java.util.*;
public class Tiling {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of tiles: ");
        int tile=s.nextInt();
        System.out.println("Maximum possible way of arranging "+tile+" tiles (2*1) on a board of 2*N is: "+tilingProb(tile));
    }
    public static int tilingProb(int tile){
        if(tile==0 || tile==1){
            return 1;
        }
        return tilingProb(tile-1)+tilingProb(tile-2);
    }
}
