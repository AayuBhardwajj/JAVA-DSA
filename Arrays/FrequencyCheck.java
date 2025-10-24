import java.util.HashMap;
import java.util.Map;
public class FrequencyCheck {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,7,3,9,9,7,2,1};
        findTheFrequencies(arr);

    }
    public static void findTheFrequencies(int arr[]){
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i: arr){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }
        int countH=Integer.MIN_VALUE;
        int countL=Integer.MAX_VALUE;
        int Hcount=0;
        int Lcount=0;

        for(Map.Entry <Integer,Integer> ntry: freq.entrySet()){
            int element= ntry.getKey();
            int freqq= ntry.getValue();

            if(freqq>countH){
                countH= freqq;
                Hcount=element;
            }
            if (freqq < countL) {
                countL = freqq;
                Lcount = element;
            }
        }
        System.out.println("Element with Highest Frequency: " + Hcount + " (Frequency: " + countH + ")");
        System.out.println("Element with Lowest Frequency: " + Lcount + " (Frequency: " + countL + ")");
    }
    }

