import java.util.HashMap;
import java.util.Map;
//Time complexity: O(n)
//Space complexity of algorithm: O(n)
public class KAnagrams {
    // Two strings are considered to be “k-anagrams” if they can be made into
    // anagrams by changing at most k characters in one of the strings. Given two
    // strings and an integer k, determine if they are k-anagrams.
    /*
     * Input Strings: "apple", "peach"
     * Input k: 1
     * Output: False
     * 
     * Input Strings: "apple", "peach"
     * Input k: 2
     * Output: True
     * 
     * Input Strings: "cat", "dog"
     * Input k: 3
     * Output: True
     * 
     * Input Strings: "debit curd", "bad credit"
     * Input k: 1
     * Output: True
     * 
     * Input Strings: "baseball", "basketball"
     * Input k: 2
     * Output: False
     * 
     * 
     */
    public static boolean hasKAnagrams(String s, String t, int k) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) > 1) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                }
            }
        }
        int result = 0;
        for (int i : map.values()) {
            result++;
        }
        if (k == result) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "baseball";
        String t1 = "basketball";
        int k1 = 2;
        boolean result = hasKAnagrams(s1, t1, k1);
        System.out.println(result);
    
    }
}
//Time for conclusion of function: 22 minutes
