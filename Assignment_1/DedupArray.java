import java.util.ArrayList;
//Time complexity = O(n)
//Space complexity = O(n*m)

public class DedupArray {
    // Given a sorted array of non-negative integers, modify the array by removing
    // duplicates so each element only appears once.
    public static int[] removeRepeat(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result.add(arr[i]);
            } else if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        int[] result = removeRepeat(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
// 24 min to complete
