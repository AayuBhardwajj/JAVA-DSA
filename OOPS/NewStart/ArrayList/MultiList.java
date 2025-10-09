package ArrayList;
import java.util.*;
public class MultiList {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
       /*  list.add(1);
        list.add(2);
        list.add(3);
        mainList.add(list);
        System.out.println(mainList);*/
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        for(int i=1;i<=5;i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);    

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> curr= mainList.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
