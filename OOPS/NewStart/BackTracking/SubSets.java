package BackTracking;

public class SubSets {
    public static void main(String[] args){
        String str="abc";
        findSubSetS(str, "", 0);
    }
    public static void findSubSetS(String str,String strr, int i){
        if(i==str.length()){
            if(strr.isEmpty()){
                System.out.println("Null");
            }
            else{
                System.out.println(strr);
            }
            return;
        }
        findSubSetS(str, strr+str.charAt(i), i+1);
        findSubSetS(str, strr, i+1);
    }
}
