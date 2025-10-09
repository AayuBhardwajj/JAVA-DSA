package ArrayList;
import java.util.*;
public class Monotone {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the required size: ");
        int size=s.nextInt();
        ArrayList<Integer>list= new ArrayList<>();
        System.out.println("Enter the "+size+" elements: ");
        for(int i=0;i<size;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println("The list formed: ");
        System.out.println(list);
        if (findMonotone(list)) {
            System.out.println("It is monotonous");
        }
        else{
            System.out.println("Not monotonous");
        }
       
    }
    public static boolean findMonotone(ArrayList <Integer>list){
        boolean increasing=true;
        boolean decreasing=true;
        if(list.size()<2){
            return true;
        }
        for(int i=1;i<list.size();i++){
            if(list.get(i)>list.get(i-1)){
                decreasing=false;
            }else if(list.get(i)<list.get(i-1)){
                increasing=false;
            }
    }
    return increasing|| decreasing;
}
}

