public class MergeSortedArray {
    public static void main(String[] args){
        int arr1[]={1,4,6,0,0,0};
        int arr2[]={2,3,5};
        int m=3;
        int i=m-1;
        int j=arr2.length-1;
        int k=m+arr2.length-1;

        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k--]=arr1[i--];
            }else{
                arr1[k--]=arr2[j--];
            }
        }
            while(j>=0){
                arr1[k--]=arr2[j--];
            }
        

        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}
