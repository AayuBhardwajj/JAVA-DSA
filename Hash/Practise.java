import java.util.HashMap;
import java.util.Map;
public class Practise {
    public static void main(String[] args) {
        HashMap <Integer, String> hm= new HashMap<>();
        hm.put(1, "Aayush");
        hm.put(2,"Ayush");
        hm.put(3,"Yushh");

        System.out.println(hm.get(2));

        System.out.println(hm.containsKey(4));
        System.out.println(hm.containsValue("Aayush"));

        for(int i:hm.keySet()){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();
        for(Map.Entry<Integer, String>en: hm.entrySet()){
            System.out.println(en.getKey()+" "+en.getValue());
        }
    }
}
