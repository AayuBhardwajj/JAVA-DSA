import java.util.*;

public class Codechef
{
	public static void main (String[] args) 
	{
    Scanner s= new Scanner(System.in);
    String str= s.nextLine();
    HashMap<Character, Integer> hm = new HashMap<>();
    for(char c: str.toCharArray()){
        hm.put(c , hm.getOrDefault(c,0)+1);
    }
    if(hm.size()==3 && hm.containsKey('c') && hm.containsKey('a')&& hm.containsKey('t')  ){
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }
	}
}

