public class Pal1 {
    public static void main(String[] args){
        String s="car";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
