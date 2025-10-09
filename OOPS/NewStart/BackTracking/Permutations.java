package BackTracking;
public class Permutations {
    public static void main(String[] args){
        String sr="abc";
        findPermutations(sr, "");
    }
    public static void findPermutations(String sr, String ans){
        if(sr.length()==0){
            System.err.println(ans);
            return;
        }
        for(int i=0;i<sr.length();i++){
            char curr=sr.charAt(i);
            String newr=sr.substring(0,i)+sr.substring(i+1);
            findPermutations(newr, ans+curr);
        }

    }
}
