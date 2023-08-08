public class q7LargestSquareOf1s {
    public static int largestSquare(int[][] grid) {
        // Given a square matrix of 0s and 1s, find the dimension of the largest square
        // consisting only of 1s.

        // To know the size of the largest square
        // We can simply generate a square with the greater size of the grid and go
        // through it checking if there's a square this size
        // If not, decrease the counter and check for the smaller square, until reaches
        // 1.
        // When found return the number
        return -1;
    }

    public static void main(String[] args) {
        // 0% done
        // Strategy: Dynamic Programming
        // Time complexity O( )
        // Space complexity O( )
        //Time elapsed: 
        int[][] grid1 = {
                { 0, 1, 0, 1 },
                { 0, 0, 1, 1 },
                { 0, 1, 1, 1 },
                { 0, 0, 1, 1 }
        };
        int ans = largestSquare(grid1);
        System.out.println(ans);
    }
}
