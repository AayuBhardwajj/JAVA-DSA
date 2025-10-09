package Arrays;
import java.util.HashMap;
import java.util.Map;
public class Majority {
    public static void main(String[] args){
        int arr[]={2,2,3,3,1,2,3,3,3};
        //findTheMajorityElement(arr);
        //betterApproach(arr);
        best(arr);
    }
    public static void findTheMajorityElement(int arr[]){
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    sum++;
                }
            }
            if(sum>arr.length/2){
                System.out.println(arr[i]+" is the majority element ");
                return;
            }
        }
        System.out.println("No majority element found");

}

    public static void betterApproach(int arr[]){
        HashMap <Integer, Integer> hm= new HashMap<>();
        for(int i: arr){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> en : hm.entrySet()){
            if(en.getValue()>arr.length/2){
                System.out.println("The majority element is: "+en.getKey());
                return;
            }
        }
        System.out.println("There doesn't exists any majority element");
    }

        public static void best(int arr[]){
            int count=0;
            int el=0;
            for(int i: arr){
                if(count==0){
                    el=i;
                    count=1;
                }
                else if(i==el){
                    count++;
                }
                else{
                    count--;
                }
            }
            System.out.println("Majority ELement is: "+el);
        }
}
