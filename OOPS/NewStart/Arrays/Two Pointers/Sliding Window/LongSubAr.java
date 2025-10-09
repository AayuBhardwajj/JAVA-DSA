//package Arrays.Two Pointers.Sliding Window;

public class LongSubAr {
public static void main(String [] args){
    int arr[]={2,5,1,7,10};
    int k=14;
    findLongestSubArrayLessThanK(arr, k);
 }
public static void findLongestSubArrayLessThanK(int arr[], int k){
    int start=0;
    int end=0;
    int maxL=0;
    int sum=0;
    int bestStart=0;
    int bestEnd=0;
    for(end =0;end<arr.length;end++){
        sum+=arr[end];


    while(sum>k && start<=end){
        sum-=arr[start];
        start++;
    }

    if(end-start+1>maxL){
        maxL=end-start+1;
        bestStart=start;
        bestEnd=end;
    }
    }
    if(maxL==0){
        System.out.println("No elements found");
        return;
    }

    System.out.println("The the conditon of sum of elements less than "+ k+ " is:");
    for(int i=bestStart;i<=bestEnd;i++){
        System.out.println(arr[i]+" ");
    }

    System.out.println("Maximum length is: "+maxL);
}
}