package Arrays;

public class SA {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                System.out.print(arr[k]);
                sum+=arr[k];
            }
            System.out.println();
            System.out.println("Sum of this sub array is: "+sum);
            System.out.println();
            max=Math.max(max, sum);
        }
    }
    System.out.println(max);
}

}
