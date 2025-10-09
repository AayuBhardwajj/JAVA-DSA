package ArrayList;

import java.util.ArrayList;

public class Deletefnc {
    public static void main(String[] args){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println("After using the inbuild delete function: ");
        System.out.println(list);
    }
}
