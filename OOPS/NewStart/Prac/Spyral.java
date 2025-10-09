package NewStart.Prac;
import java.util.*;
public class Spyral {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int row=s.nextInt();
        System.out.println("Enter the size of columns: ");
        int col=s.nextInt();
        int arr[][]= new int[row][col];
        System.out.println("Enter the elements for rows and columns: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
        printAr(arr, row, col);
        System.out.println();
        System.out.println("The spiral path of the elements is: ");
        spiralWay(arr, row, col);

    }
    public static void printAr(int arr[][], int row, int col){
        for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.println("Element entered at position [ "+i+" , "+j+" ] is: "+arr[i][j]);
        }
        System.out.println();
        }
    }
    public static void spiralWay(int arr[][], int row, int col){
        int str=0;
        int stc=0;
        int endr=arr.length-1;
        int endc=arr[0].length-1;
        while(str<=endr && endr<=endc){
            for(int j=stc;j<=endc;j++){
                System.out.print(arr[str][j]+" ");
            }
            for(int i=str+1;i<=endr;i++){
                System.out.print(arr[i][endc]+" ");
            }
            for(int j=endc-1;j>=stc;j--){
                System.out.print(arr[endr][j]+" ");
            }
            for(int i=endr-1;i>=str+1;i--){
                System.out.print(arr[i][stc]+" ");
            }
            stc++;
            str++;
            endc--;
            endr--;
        }
        System.out.println();
    }
}
