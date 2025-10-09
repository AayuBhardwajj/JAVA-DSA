package Arrays;
import java.util.*;
public class PascalT3 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the numnber of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols=s.nextInt();
       // System.out.println(printNthRow(rows));
       optimiziedPascalTriangle(rows, cols);

    }
    public static ArrayList<Integer> printNthRow(int row){
        ArrayList <Integer> al= new ArrayList<>();
        int a= 1;
        al.add(a);
        for(int i=1;i<=row;i++){
            a=a*(row-i+1)/i;
            al.add(a);
        }
        System.out.println(al);
        return al;
    }

     public static void optimiziedPascalTriangle(int rows, int cols){
         ArrayList<ArrayList <Integer>> mainList= new ArrayList<>();

         for(int i=0;i<rows;i++){
         
         mainList.add(printNthRow(i));
         }
         System.out.println(mainList);
     }
}
