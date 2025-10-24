import java.util.HashSet;
public class RemDupFrSrAr {
    public static void main(String[] args){
        int arr[]={1,1,2,2,3,4,4,4,5};
        removeTheDuplicateElements(arr);

    }
    public static void removeTheDuplicateElements(int arr[]){
      HashSet <Integer> hs= new HashSet<>();
      for(int i=0;i<arr.length;i++){
        hs.add(arr[i]);
      }
      for(int i: hs){
        System.out.print(i+" ");
      }
}
}
