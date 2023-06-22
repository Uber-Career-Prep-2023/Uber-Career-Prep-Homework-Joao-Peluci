import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class q9MergeSortedArrays {
    // Question 9: MergeKSortedArrays
    // Given an array of k sorted arrays, merge the k arrays into a single sorted
    // array.
    // Time Complexity: O(k*n)
    // Space Complexity: O(n)
    // Technique: HashMap
    // Time elapsed: 40min
    
    public static ArrayList<Integer> merge(int k, int[][] arr) {
        // Read all the values and put them into a Map
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!map.containsKey(arr[i][j])) {
                    map.put(arr[i][j], 1);
                } else {
                    map.put(arr[i][j], map.get(arr[i][j]) + 1);
                }
            }
        }
        // Reads keyset from map and put their values into arraylist
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : map.keySet()) {
            int size = map.get(i);
            for (int j = 0; j < size; j++) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Test 1:
        int k1 = 2;
        int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 1, 3, 5, 7, 9 } };
        ArrayList<Integer> printArray1 = merge(k1, arr1);
        for (Integer integer : printArray1) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // Test 2:
        int k2 = 3;
        int[][] arr2 = { { 1, 4, 7, 9 }, { 2, 6, 7, 10, 11, 13, 15 }, { 3, 8, 12, 13, 16 } };
        ArrayList<Integer> printArray2 = merge(k2, arr2);
        for (Integer integer : printArray2) {
            System.out.print(integer + " ");
        }

    }
}
