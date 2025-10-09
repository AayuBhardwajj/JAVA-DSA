package Arrays;

public class RotateRight {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6};
        int rot=3;
        //rightRot(arr,rot);
        rotateTheArray(arr, rot);
        printArray(arr);
    }
    public static void rightRot(int arr[], int rot){
        int temp[]=new int[arr.length];
        for(int i=0;i<temp.length;i++){
            temp[i]=arr[i];
        }
        for(int i=rot;i<arr.length;i++){
            arr[i-rot]=arr[i];
        }
        for(int i=0;i<rot;i++){
            arr[arr.length-rot+i]=temp[i];

        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void optRotate(int arr[], int start, int end)
{
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
    }

}
    public static void rotateTheArray(int arr[], int rot){
        if(rot>arr.length){
            rot=rot%arr.length;
        }
        optRotate(arr, 0, arr.length-1);
        optRotate(arr, 0, rot-1);
        optRotate(arr, rot, arr.length-1);
    }
}
