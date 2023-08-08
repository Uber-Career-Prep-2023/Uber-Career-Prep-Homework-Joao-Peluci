import java.util.HashMap;

public class q4CatalanNumbers {
    // The Catalan numbers are a mathematical sequence of numbers. The nth Catalan
    // number is defined as (2n)! / (n+1)!n!. Given a non-negative integer n, return
    // the Catalan numbers 0-n.

    // Time Elapsed: 45min
    // Time Complexity: 2n
    // Space Complexity: 
    // Technique Used: Memoization

    // To solve this exercise, storing factorial numbers somewhere would be
    // important, so I'll fill a hashmap with the factorials when calculating them
    // If any factorial hasn't been calculated yet, we calculate it and store
    HashMap<Integer, Integer> factorialNumbers = new HashMap<>();

    public int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        if (factorialNumbers.containsKey(n)) {
            return factorialNumbers.get(n);
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
            factorialNumbers.put(i, result);
        }

        return result;
    }

    public int catalan(int n) {
        int result = fact(2 * n) / (fact(n + 1) * fact(n));
        return result;
    }

    public static void main(String[] args) {
        // 100% done
        // Strategy: Memoization 
        // Time complexity O(n)
        // Space complexity O(n)
        // Time elapsed: 30min
        q4CatalanNumbers q = new q4CatalanNumbers();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(q.catalan(i));
        }

    }
}
