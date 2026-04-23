
import java.util.*;
public class Un {
    public static void main(String[] args){
        int arr1[]={1,1,2,3,3,4,5};
        int arr2[]={4,4,5,5,6,7};
        int m= arr1.length;
        int n= arr2.length;
        //findUnion(arr1, arr2, m, n);
        findUnionOptimized(arr1, arr2, m, n);

    }
    public static void findUnion(int arr1[], int arr2[], int m, int n){
        HashSet<Integer> hm = new HashSet<>();
        for(int i=0;i<m;i++){
            hm.add(arr1[i]);
        }
        for(int j=0;j<n;j++){
            hm.add(arr2[j]);
        }
        System.out.println(hm);
    }

    public static void findUnionOptimized(int arr1[], int arr2[], int m, int n){
        ArrayList<Integer> al= new ArrayList<>();
        int i=0;
        int j=0;

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                if(al.size()==0 || al.get(al.size()-1)!=arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
            } else if(arr2[j]<arr1[i]){
                if(al.size()==0 || al.get(al.size()-1)!=arr2[j]){
                    al.add(arr2[j]);
                }
                j++;
            }else{
                if(al.size()==0 || al.get(al.size()-1)!=arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
            while(i<m){
                if(al.size()==0 ||al.get(al.size()-1)!=arr1[i]){
                    al.add(arr1[i]);
                }
                i++;
            }
            while(j<n){
                if(al.size()==0 ||al.get(al.size()-1)!=arr1[j]){
                    al.add(arr2[j]);
                }
                 j++;
            }
            System.out.println(al);
        }
}
