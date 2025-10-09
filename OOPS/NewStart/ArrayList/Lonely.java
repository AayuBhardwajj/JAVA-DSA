package ArrayList;
import java.util.*;
public class Lonely {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of required elements: ");
        int size=s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<size;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println("List formed: ");
        System.out.println(list);
        System.out.println();
        findLonelyElement(list);
    }
    public static void findLonelyElement(ArrayList<Integer>  list){
        Collections.sort(list);
        boolean foundAny=false;
        for(int i=0;i<list.size();i++){
            boolean found=true;
            if(i>0 && Math.abs(list.get(i)-list.get(i-1))<=1){
                found=false;
            }
            else if( (i<list.size()-1 && Math.abs(list.get(i)-list.get(i+1)) <=1)){
                found =false;
            }
    
    if(found==true){
        System.out.println("The lonely element is: "+list.get(i));
        foundAny=true;
    }
    if(foundAny==false){
        System.out.println("No lonely element");
    }
}
    }
}
