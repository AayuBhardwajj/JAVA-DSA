package Recursion;

import java.util.*;

public class SubSets {
    public static void main(String[] args){
        int arr[] = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();

        findSubsets(0, arr, new ArrayList<>(), result);

        System.out.println(result);
    }

    public static void findSubsets(int index, int arr[],
                                   List<Integer> current,
                                   List<List<Integer>> result){

        // Base condition
        if(index == arr.length){
            result.add(new ArrayList<>(current)); // store copy
            return;
        }

        // PICK the element
        current.add(arr[index]);
        findSubsets(index + 1, arr, current, result);

        // BACKTRACK (remove last element)
        current.remove(current.size() - 1);

        // NOT PICK the element
        findSubsets(index + 1, arr, current, result);
    }
}