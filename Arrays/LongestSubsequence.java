public class LongestSubsequence {
    public static void main(String[] args){
        int arr[]={102,4,100,1,101,3,2,1,1};
        System.out.println(findLongestSubseq(arr));
    }

    public static int findLongestSubseq(int arr[]){
        int longest=1;
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            int count=0;
            while (linearSearch(arr, x)==true){
                count++;
                x++;
            }  
            longest=Math.max(longest, count)  ;
    }
    return longest;
}

    public static boolean linearSearch(int arr[], int x){
        boolean check=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
        }
    }
    return false;
}

}
