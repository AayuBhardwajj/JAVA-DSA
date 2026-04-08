package SubArr;
import java.util.HashSet;
public class FruitsInBasket {
    public static void main(String[] args){
        int arr[]={1,1,2,1,3,3,3,3};
        int k=2;
        int minL=Integer.MIN_VALUE;
       
        for(int i=0;i<arr.length;i++){
             HashSet <Integer> hs= new HashSet<>();
            for(int j=i;j<arr.length;j++){
                hs.add(arr[j]);

                if(hs.size()>2){
                    break;
                }
                int length= j-i+1;
                    minL=Math.max(minL, length);
            }
        }
        System.out.println(minL);
    }
    
}
