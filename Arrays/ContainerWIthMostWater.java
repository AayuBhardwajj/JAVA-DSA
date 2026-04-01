public class ContainerWIthMostWater {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        //findTheMaxVol(arr);
        usingTP(arr);
    }
    public static void findTheMaxVol(int arr[]){
        int max=0;
       for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int height=Math.min(arr[i],arr[j]);
            int width=j-i;
            int fin=height*width;

            max=Math.max(max, fin);
        }
       }
       System.out.println(max);
    }

    public static void usingTP(int arr[]){
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right){
            int height=Math.min(arr[left],arr[right]);
            int width=right-left;
            int vol=height*width;

            max=Math.max( vol, max);

            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(max);
    }
}
