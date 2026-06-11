package Placement;
public class ReversePairs {
    public static void main(String[] args) {
        int arr[]={1,3,2,3,1};
    //brute(arr);   
    int count=0;
    mergeS(arr, 0, arr.length-1);
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]> 2* arr[i+1]){
            count++;
        }
    }
    System.out.println(count);
    }
    public static void brute(int arr[]){
    int count=0;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if((arr[i]>2*arr[j]) && j>i){
                count++;
            }
        }
    }
    System.out.println(count);
    }
    public static void mergeS(int arr[], int start, int end){
        if(start<end){
            int mid= start+(end-start)/2;
        
        mergeS(arr, start, mid);
        mergeS(arr, mid+1, end);
        sortAll(arr, start, mid, end);
    }

    
}

    public static void sortAll(int arr[], int start, int mid, int end){
        int i=start;
        int j=mid+1;
        int temp[]= new int[(end-start)+1];
        int k=0;
        while(i<=mid && j<=end){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];
        }else{
            temp[k++]=arr[j++];
        }
    }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
    
        while(j<=end){
            temp[k++]=arr[j++];
        }
    
        for(i=start ,k=0;k<temp.length; k++, i++){
            arr[i]=temp[k];
        }
    }
    

}