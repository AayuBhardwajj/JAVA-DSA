public class dup {
    public static void main(String args[]){
        int arr[]={3,5,11,7,3,9,3};
        remDup(arr);
    }
    public static void remDup(int arr[]){
        int hel[]=new int[arr.length];
        int helin=0;
        boolean dupl=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<hel.length;j++){
                if(arr[i]==hel[j]){
                    dupl=true;
                    break;
                }
            }
            if(dupl==false){
                hel[helin]=arr[i];
                helin++;
            }
        }
        for(int i=0;i<hel.length;i++){
            System.out.print(hel[i]+" ");
        }

    }
}
