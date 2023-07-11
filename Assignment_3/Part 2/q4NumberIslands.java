public class q4NumberIslands {
    // Given a binary matrix in which 1s represent land and 0s represent water.
    // Return the number of islands (contiguous 1s surrounded by 0s or the edge of
    // the matrix).
    // Gave up
    public static int numberIslands(int[][] terrain) {
        int result = 0;
        // We can make bruteforce with two nested for loops:
        // boolean foundLand = false;
        // boolean moreWater = false;

        for (int i = 0; i < terrain.length; i++) {
            for (int j = 0; j < terrain[i].length; j++) {
                if (terrain[i][j] == 1) {
                    terrain[i][j] = 0;
                    result++;
                }
                System.out.print(terrain[i][j]);
            }
            System.out.println();
        }

        // We can also do a search by nearest neighbohrs first

        return result;
    };

    public static void main(String[] args) {
        // Our implementation starts seeking for land (1)
        // We'll receive a binary matrix
        // Testcase 1
        int[][] terrain1 = {
                { 1, 1, 1, 1, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }
        };

        // Output: 1

        // Testcase 2
        int[][] terrain2 = {
                { 1, 1, 0, 0, 0 },
                { 1, 1, 0, 1, 0 },
                { 1, 1, 0, 0, 1 },
                { 0, 0, 1, 1, 1 }
        };

        // Output: 3

        // Testcase 3
        int[][] terrain3 = {
                { 1, 0, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 0, 1, 0, 0 },
                { 0, 0, 0, 1, 0 },
                { 0, 0, 0, 0, 1 }
        };

        // Output: 5

        int num1 = numberIslands(terrain1);
        int num2 = numberIslands(terrain2);
        int num3 = numberIslands(terrain3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
