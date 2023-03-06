//Time complexity worst case: O(n)
//Space complexity of algorithm: O(1)
//Technique: Single pointer search
public class MissingInteger {
    // Given an integer n and a sorted array of integers of size n-1 which contains
    // all but one of the integers in the range 1-n, find the missing integer.
    public static int isMissing(int n, int[] arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            if (arr[i]==n){
                n--;
            }
        }
        
        return n;
    }
    public static void main(String[] args) {
        //int n1 = 7;
        //int n2 = 2;
        int n3 = 12;
        //int[] arr1 = {1, 2, 3, 4, 6, 7};
        //int[] arr2 = {1};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12};
        int result = isMissing(n3, arr3);
        System.out.println(result);
    }
}
//Time for conclusion of function: 7 minutes
