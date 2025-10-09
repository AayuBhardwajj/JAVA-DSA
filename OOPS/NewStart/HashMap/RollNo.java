package HashMap;
import java.util.HashMap;
import java.util.Map;
public class RollNo {
    public static void main(String[] args){
        HashMap<Integer , String> map= new HashMap<>();
        map.put(0001, "Aayush");
        map.put(0002, "Aayu");
        map.put(0003, "Systumm");
        System.out.println(map);
        // map.remove(0002);
        // System.out.println("Updated map: ");
        // System.out.println(map);

        System.out.println(map.containsKey(0001));
        System.out.println(map.get(0001));

        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.print(e.getKey()+" "+ e.getValue());
        }
    }
}
