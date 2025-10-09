package Prac;

public class FindSubSets {
    public static void main(String[] args) {
    String str="abc";
    findSubSetss(str, "", 0);
    }
    public static void findSubSetss(String str, String ans, int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
                return;
            }
            
        
        findSubSetss(str, ans+str.charAt(i), i+1);
        findSubSetss(str, ans, i+1);
    }
}
