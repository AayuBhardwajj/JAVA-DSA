import java.util.HashSet;
public class UnionTwoSorted{
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hm.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hm.add(arr2[i]);
        }

      for(int x: hm){
        System.out.print(x+" ");
      }

    }
}
