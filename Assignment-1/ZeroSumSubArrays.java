//Time complexity: O(n^2)
//Space Complexity: O(n), input size = n
//Used Variable-size growing sliding window


//Working, but I didn't understood why the output in this case is zero if there is two subarrays
        //Input Array: [8, -5, 0, -2, 3, -4]
        //Output: 0
        //(Subarrays: [0], [8, -5, 0, -2, 3, -4])

public class ZeroSumSubArrays {
    // Given an array of integers, count the number of subarrays that sum to zero.
    public static int zeroSumSubArrays(int[] arr) {
        int out = 0;
        int k = 0;

        while (k < arr.length) {
            int l = k;
            int intSum = arr[l];
            while (l < arr.length) {
                if (l != k) 
                    intSum += arr[l];
                if (intSum==0)
                    out++;
                l++;
            }
            k++;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, -1, -3, -3, 4, 6, -7};
        //int[] arr = {1, 8, 7, 3, 11, 9};
        //int[] arr = {8, -5, 0, -2, 3, -4};

        int result = zeroSumSubArrays(arr);
        System.out.println(result);
    }
}
//37 minutes to solve
