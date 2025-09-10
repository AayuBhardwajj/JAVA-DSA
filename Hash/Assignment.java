//package JAVA-DSA.Hash;
    import java.util.*;
public class Assignment {

    public static void main(String[] args){
        int arr[] = {1, 3, 5, 6, 2, 1, 3, 5, 2};

        // Use HashMap to store frequencies
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for(int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print frequency of each element
        System.out.println("Frequencies of all elements:");
        for(Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


