package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of list: ");
        int size=s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<size;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println("The final list...");
        System.out.println(list);
        sortTheList(list);
    }
    public static void sortTheList(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.println("The sorted ascending order list: ");
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("The sorted list in descending order: ");
        System.out.println(list);
    }
}
