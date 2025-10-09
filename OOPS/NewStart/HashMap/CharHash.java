package HashMap;
import java.util.*;
public class CharHash {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String s1="abcdadbacdaef";
        int hash[]=new int[10];
        for(int i=0; i<s1.length();i++){
            hash[s1.charAt(i)-'a']++;
        }
        // System.out.println("Enter the character whose frequency you wanna find out: ");
        // char ch=s.next().charAt(0);
        // System.out.println(hash[ch]);

        for(int i=0;i<hash.length;i++){
            if(hash[i]>0){
            System.out.println((char)(i+'a')+"-> "+hash[i]);
        }
    }
}
}