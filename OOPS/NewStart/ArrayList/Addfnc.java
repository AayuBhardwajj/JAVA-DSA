package ArrayList;

import java.util.ArrayList;

public class Addfnc {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println("After adding at index: ");
        list.add(1,100);
        System.out.println(list);
    }
}
