import java.util.HashSet;
public class RemDupFrSrAr {
    public static void main(String[] args){
        int arr[]={1,1,2,2,3,4,4,4,5};
        removeTheDuplicateElements(arr);
        twoPoint(arr);

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

    public static void twoPoint(int arr[]){
        int i=0;
        int count=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println();
        for(int k=0;k<=i;k++){
            System.out.println(arr[k]+" ");
        }
        System.out.println();
        System.out.print(i+1);
    }
}
