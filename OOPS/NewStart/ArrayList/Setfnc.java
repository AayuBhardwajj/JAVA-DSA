package ArrayList;

import java.util.ArrayList;

public class Setfnc {
    public static void main(String[] args){
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.set(0, 100);
        System.out.println("After using the Set function: ");
        System.out.println(list);
    }
}
