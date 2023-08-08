public class q5MinCostStairClimbing {
    // Started 15h45
    // Deadline 16h25

    // A staircase of a hiking trail implements a rather unusual toll system to
    // cover trail maintenance costs. Each stair in the staircase has a different
    // toll which you only have to pay if you step on that stair. Due to the height
    // of the stairs, you can only climb one or two stairs at once. This means that
    // from the ground you must initially step on either stair 0 or stair 1 and
    // that, if there are n stairs, the last stair you step on can be either stair
    // n-1 or n-2. Given an array representing the costs per stair, what is the
    // minimum possible toll you can pay to climb the staircase?

    // Examples:
    // Input: [4, 1, 6, 3, 5, 8]
    // Output: 9 (step on stairs 1, 3, 4 for a cost of 1+3+5)

    // Input: [11, 8, 3, 4, 9, 13, 10]
    // Output: 25 (step on stairs 1, 3, 5 for a cost of 8+4+13)

    // For climbing the saircase, we need to initialize an array Staircase
    // And a pointer (i)

    public static int minCost(int[] s) {
        int cost = 0;
        int pointer = 0;
        if (s[0] > s[1]) {
            pointer = 1;
            cost += s[pointer];
        }
        // System.out.println("Degrau: "+pointer+"Preco: "+s[pointer]);
        while (pointer < s.length) {
            if (pointer + 2 < s.length) {
                if (s[pointer + 1] > s[pointer + 2]) {
                    pointer += 2;
                    cost += s[pointer];
                    // System.out.println("Degrau: "+pointer+"Preco: "+s[pointer]);
                } else {
                    pointer += 1;
                    cost += s[pointer];
                    // System.out.println("Degrau: "+pointer+"Preco: "+s[pointer]);
                }
            } else {
                // System.out.println("Degrau: "+pointer+"\nPreco: "+cost);
                break;
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        // Just need to fix a pointer, 95% done
        //Strategy: 
        // Time complexity O(n)
        // Space complexity O(1)
        //Time elapsed: 40min
        // int[] staircase1 = { 4, 1, 6, 3, 5, 8 };
        int[] staircase2 = { 11, 8, 3, 4, 9, 13, 10 };
        int result = minCost(staircase2);
        System.out.println(result);
    }
}
