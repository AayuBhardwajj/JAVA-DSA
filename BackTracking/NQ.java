package BackTracking;
import java.util.*;
public class NQ {
    static int count=0;
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of queens: ");
        int n=s.nextInt();
        char arr[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='*';
            }
        }
        Nqueenss(arr, 0);
        System.out.println("Max possible ways: "+count);
    }
    public static void Nqueenss(char arr[][],int row ){
        if(row==arr.length){
            printboars(arr);
            count++;
            return;
        }
        for(int j=0;j<arr.length;j++){
            if(checkTr(arr, row, j)==true){
            arr[row][j]='Q';
            Nqueenss(arr, row+1);
            arr[row][j]='*';
        }
    }
    }
    public static void printboars(char arr[][]){
        System.out.println("---------------");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    
    public static boolean checkTr(char arr[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1;i>=0 && j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}
