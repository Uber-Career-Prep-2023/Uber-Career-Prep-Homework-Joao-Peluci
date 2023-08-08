public class q8CoinChange {
    public static int change(int[] coins, int sum) {
        //Dynamic programming
        //Store intermediate solutions
        // If sum = 20 
        // [2,2,2,2,2,2,2,2,2,2]
        // [2,2,2,2,2,10]
        // [5,5,10]
        // [5,5,5,5]
        // or [10,10]
        // or [2,2,2,2,2,5,5]
        // if (sum==0 or coins.length == 0)
        // returns 0
        // I can initialize a grid
        // int[] solutions = new int[coins.lenght+1]
        // [2 | 5 | 10] 
        // [0 | 0 | 2 ]
        // [0 | 2 | 1 ]
        // [0 | 4 | 0 ]
        // [5 | 2 | 0 ]
        // [10| 0 | 0 ]
        
        


        return -1;
    }

    public static void main(String[] args) {
        // 0% done
        // Strategy: Dynamic Programming
        // Time complexity: O()
        // Space complexity: O()
        // Time elapsed: 
        int[] coins = {2, 5, 10};
        int sum = 20;
        int ans = change(coins, sum);
        System.out.println(ans);
    }
}
