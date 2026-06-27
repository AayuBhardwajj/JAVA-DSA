import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveArraySort{
    public static void main(String[] args){
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(3,1,2,4)) ;
        sort(al);
        System.out.println(al);
    }
    public static void sort(ArrayList<Integer> al){
        if(al.size()<=1){
            return;
        }
        int last=al.remove(al.size()-1);
        sort(al);
        insert(al,last);
    }
    public static void insert(ArrayList<Integer>al, int temp){
        if(al.size()==0 || al.get(al.size()-1)<=temp){
            al.add(temp);
            return;
        }
        int last=al.remove(al.size()-1);
        insert(al, temp);
        al.add(last);
    }
}