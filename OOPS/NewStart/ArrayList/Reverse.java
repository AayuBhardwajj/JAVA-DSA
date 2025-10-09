package ArrayList;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements you want in your list: ");
        int eles=s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        System.err.println("Enter the "+eles+" elements: ");
        for(int i=0;i<eles;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println("The final list: ");
        System.out.println(list);
        System.out.println("The reversed list is: ");
        //findRev(list);
        findRevTp(list);
    }
    public static void findRev(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    public static void findRevTp(ArrayList<Integer> list){
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int temp=list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
        System.out.println("The updated list: ");
        System.out.println(list);
    }
}