public class LongestSubArray {
    public static void main(String[] args){
        int arr[]={2,5,1,7,10};
        int x=14;
       //findLongestSubArrayLessThanK(arr, x);
       optimizedSubArray(arr, x);
    }
    public static void findLongestSubArrayLessThanK(int arr[],int x){
        int maxLength=0;
        int startIndex=0;
        for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i;j<arr.length;j++){
        sum+=arr[j];
        if(sum<=x){
            int length=j-i+1;
            if(length>maxLength){
                maxLength=length;
                startIndex=i;
            } else if(sum>x){break;}
        }   
    }
}
    System.out.println("The maximum length of subArray whose sum is less than or equal to "+x+" is: "+maxLength);

    if(maxLength>0){
        System.out.println("SubArray: ");
        for(int i=startIndex;i<startIndex+maxLength;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
    public static void optimizedSubArray(int arr[], int x){
        int start=0;
        int end=0;
        int maxL=0;
        int length=0;
        int sum=0;
        int bestS=0;
        while(end<arr.length){
        sum+=arr[end];
        while(sum>x && start<=end){
            sum-=arr[start];
            start++;
        }
        length=end-start+1;
        if(length>maxL){
            maxL=length;
            bestS=start;
        }
        end++;
        }
        System.out.println("longest length of subArray having sum less than equal to "+x+": "+maxL);
        for(int i=bestS;i<bestS+maxL;i++){
            System.out.print(arr[i]+" ");
        }
    }
}