package String;
import java.util.*;
public class SubS {
    public static void main(String[] args) {
        String str="Aayush";
        System.out.println(subString(str, 0, 4));
    }
    public static String subString(String str, int st, int end){
        String bym="";
        for(int i=st;i<end;i++){
            bym+=str.charAt(i);
        }
        return bym;
    }
}
