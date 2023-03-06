import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static int twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {// fixed pointer i
            if (set.contains(nums[i])) {
                count++;
                
            } else {
                set.add(nums[i]);
            }
        }   
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 10, 8, 3, 2, 5, 7, 2, -2, -1 };
        int k = 8;
        System.out.println(twoSum(nums, k));

    }
}
