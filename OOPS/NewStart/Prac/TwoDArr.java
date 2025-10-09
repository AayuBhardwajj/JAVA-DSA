package NewStart.Prac;
import java.util.*;

public class TwoDArr {
public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int row=s.nextInt();
    System.out.println("Enter the number of columns: ");
    int col=s.nextInt();
    int arr[][]=new int[row][col];
    System.out.println("Enter the "+row+" elements for rows: ");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=s.nextInt();
        }
    }
    printArrayy(arr,row,col);
}
    public static void printArrayy(int arr[][],int row, int col){
        
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}    
}
