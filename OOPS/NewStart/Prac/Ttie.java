package NewStart.Prac;

public class Ttie {
    public static void main(String[] args) {
        int arr[]={1,8,6,2,5,4,8,3,7};
        System.out.println(optimizedOP(arr));

    }
    public static int probS(int arr[]){
        int maxV=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int breadth=Math.abs(j-i);
                int height=Math.min(arr[i], arr[j]);
                int waterS= height*breadth;
                maxV=Math.max(waterS, maxV);
            }
        }
        return maxV;
    }
    public static int optimizedOP(int arr[]){
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<=right){
            int area=0;
            int length=Math.min(arr[left], arr[right]);
            int breadth=Math.abs(left-right);
            area=length*breadth;
            max=Math.max(area, max);
        
        if(arr[left]<arr[right]){
            left++;
        }
        else{
            right --;
        }
    }
        return max;
    }
}
