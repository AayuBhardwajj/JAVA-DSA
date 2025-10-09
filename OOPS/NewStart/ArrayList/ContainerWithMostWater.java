/*  This is a question which is asking to figure out which container will store more water, 
by calculating the product of height and width of container */

package ArrayList;
import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        ArrayList<Integer> list= new ArrayList<>();  // using array list coz maybe the volumes of water would vary with varying containers
        System.out.println("Enter the number of lengths you wanna enter: ");
        int no=s.nextInt();
        System.out.println("Enter the "+no+" number of elements: ");
        for(int i=0;i<no;i++){
            int input=s.nextInt(); // standard way of taking input in array list. 
            list.add(input);
        }
        System.out.println("The final list: ");
        System.out.println(list);
        System.out.println("By using bruete force approach, the answer is: "+ findTheVol(list));
        System.out.println("By using 2 Pointer appraoch, the max water that can be stored is: "+findTheVolTp(list));
    }
    public static int findTheVol(ArrayList<Integer> list){
        /*  With O N square of time complexity, the integer list elements are representing the varying heights..
         ran 2 loops, from i = 0 and j=1, height of a container, would be the minimum of 2 side by side heights and 
         width would be difference between both. Then we find the water by product of height* width.
         At last, for each case, we consider the maximum, max(maxWater, water) */

        int height;
        int width;
        int water;
        int maxWater=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                height=Math.min(list.get(i), list.get(j));
                width=j-i;
                water=height*width;
                maxWater=Math.max(maxWater, water);
            }
        }
        return maxWater;
    }
    public static int findTheVolTp(ArrayList<Integer>list){
        /*
            with linear time complexity and no extra space taken, we initialise 2 pointers on each side of list formed
            now the same approach, using the values at extreme ends, we find height my taking minimum of them, width by taking difference,
            finding storage by their product and storing the product in a max variable,
            now start variable steps 1 step aagey and the process repeats
         */
        int start=0;
        int end=list.size()-1;
        int water;
        int maxWater=0;
        int height;
        int width;
        while(start<end){
            height=Math.min(list.get(start), list.get(end));
            width=end-start;
            water=height*width;
            maxWater=Math.max(maxWater, water);
            
            if(start<end){
                start++;
            }else{
                end--;
            }
        }
        return maxWater;
    }
}
