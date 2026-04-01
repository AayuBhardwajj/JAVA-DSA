public class ValidPalindrome{
    public static void main(String[] args){
        String str=" N<a.,mA >N";
        System.out.println(checkForPalindrome(str));
    }
    public static boolean checkForPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }else if(!Character.isLetterOrDigit(str.charAt(right))){
                    right--;
                }else{
                    if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
                        return false;
                    }
                    left++;
                    right--;
                }   
            }
            return true;
        }
    }

