package HashMap;
import java.util.*;
public class MuMap {
    public static void main(String[] args){
        String str="abadbfcdbg";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char se=str.charAt(i);
            
        }
            for(Map.Entry<Character, Integer> en: hm.entrySet()){
                System.out.println(en.getKey()+"  "+ en.getValue());
            }
        }
        
    }
