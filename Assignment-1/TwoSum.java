import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//Time complexity: O(n)
//Space Complexity: O(2*n), input size = n, aux map size = n
//Technique: Hash the elements

public class TwoSum {
    public static int twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(map.containsKey(nums[i])){
                int occourences = map.get(nums[i])+1;
                map.put(nums[i], occourences);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {// fixed pointer i
            if (map.containsKey(target-nums[i])) {
                System.out.println(nums[i]+","+(target-nums[i]));
                count++;
        }   
    }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 10, 8, 3, 2, 5, 7, 2, -2, -1 };
        int k = 8;
        System.out.println(twoSum(nums, k));
    }
    //40 minutes, just prints the pairs that sums up to k
}
