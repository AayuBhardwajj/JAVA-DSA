public static void findThirdLargest(int arr[],int size){
    int largest=Integer.MIN_VALUE;
    int secL=Integer.MIN_VALUE;
    int thirdL=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            thirdL=secL;
            secL=largest;
            largest=arr[i];
        }else if(arr[i]>secL && arr[i]!=largest){
            thirdL=secL;
            secL=arr[i];
        }else if(arr[i]>thirdL && arr[i]!=largest && arr[i]!=secL){
            thirdL=arr[i];
        }
    }
    System.out.println("The largest element in array is: "+largest);
    System.out.println("The second largest element in array is: "+secL);
    System.out.println("The third largest element in array is: "+thirdL);
}

