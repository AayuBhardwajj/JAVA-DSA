package Arrays;
import java.util.*;
public class Spy {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=s.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=s.nextInt();
        int arr[][]= new int[rows][cols];
        System.out.println("Enter the ( "+rows*cols+" ) elements for your "+rows+" * "+cols+" elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=s.nextInt();
            }
        }
            printTheMatrix(arr, rows, cols);
            printSpyral(arr, rows, cols);
    }
    public static void printTheMatrix(int arr[][],int rows, int cols){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void printSpyral(int arr[][], int rows,int cols){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endCol=arr[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
        for(int j=startCol;j<=endCol;j++){
            System.out.print(arr[startRow][j]+" ");
        }
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }
        for(int j=endCol-1;j>=startCol;j--){
            System.out.print(arr[endRow][j]+" ");
    }
        for(int i=endRow-1;i>=startRow+1;i--){
            System.out.print(arr[i][startCol]);
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;
}
}
}
    