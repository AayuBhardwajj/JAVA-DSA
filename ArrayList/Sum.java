package ArrayList;
import java.util.*;
public class Sum {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number of elements you wanna add: ");
        int no=s.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter the "+no+" elements: ");
        for(int i=0;i<no;i++){
            int input=s.nextInt();
            list.add(input);
        }
        System.out.println("The final list: ");
        System.out.println();
        System.out.println(list);
        System.out.println("Enter the target value of your choice: ");
        int target=s.nextInt();
        System.err.println(sumProb(list, target));
        System.out.println("Using 2 pointer approach: "+sumProbTp(list, target));
    }
    public static boolean sumProb(ArrayList<Integer> list, int target){
        boolean result=false;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int sum=list.get(i)+list.get(j);
                if(sum==target){
                    result=true;
                }
            }
        }
        return result;
    }
//Two Pointer Approach
    public static boolean sumProbTp(ArrayList<Integer> list, int target){
        Collections.sort(list);
        int start=0;
        int end=list.size()-1;
        while(start<end){
            int sum=list.get(start)+list.get(end);
            if(sum==target){
                return true;
            }
            if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return false;
    }
}
