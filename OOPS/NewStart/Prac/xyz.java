package NewStart.Prac;
import java.util.*;
public class xyz {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int rows=s.nextInt();
        System.out.println("enter the number of columns: ");
        int cols=s.nextInt();
        int arr[][]=new int[rows][cols];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println("Enter an element at position ( "+i+" , "+j+" ) : ");
                arr[i][j]=s.nextInt();
            }
        }

            System.err.println("enter an element: ");
            int key= s.nextInt();

            for( int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(arr[i][j]==key){
                        System.out.println("foun at position "+i+" "+j+" ");
                    }
                }
            }
        }
        
        }

