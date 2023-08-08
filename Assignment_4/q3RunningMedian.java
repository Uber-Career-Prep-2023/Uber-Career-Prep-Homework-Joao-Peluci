import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Time Elapsed: 25min
//Time Complexity O(1)
//Space Complexity: O(n)
//Technique Used: Save State
public class q3RunningMedian {
    public static void calculateMedian() {
        ArrayList<Double> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double median;
        while (nums.size() < 10) {
            double input = sc.nextDouble();
            nums.add(input);
            Collections.sort(nums);
            if ((nums.size() - 1) % 2 != 0) {
                double num1 = nums.get((nums.size()) / 2);
                double num2 = nums.get(((nums.size()) / 2) - 1);
                median = (num1 + num2) / 2;
            } else {
                median = nums.get((nums.size()) / 2);

            }
            System.out.println(median);
        }
        sc.close();
    }

    public static void main(String[] args) {
        // 100% done
        // Strategy: Save state
        // Time complexity O(n*log(n))
        // Space complexity O(n)
        // Time elapsed: 20min
        calculateMedian();
    }
}
