package ArrayList;
import java.util.*;
public class Getfnc {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("Enter the index which you wanna inspect: ");
        int q=s.nextInt();
        if(q>list.size()){
            System.err.println("Invalid index");
            return;
        }else{
            System.out.println("Element present at index "+q+" is: "+list.get(q));
        }
    }
}
