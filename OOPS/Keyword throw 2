class aayuKaException extends Exception{
    public aayuKaException(){
        System.out.println("Array indexing is only limited to 4");
    }
}
public class Thr1 {
    public static void main(String[] args){
        int arr[]= new int[5];

        try{
            System.out.println(arr[5]);
            for(int i=0;i<arr.length;i++){
                if(arr[i]>4){
                    throw new aayuKaException();
                }
            }
        } catch(aayuKaException e){
            System.out.println("Handle kr diya... systummm");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Bhai bahar nikl gye array se");
        }
    }
}
