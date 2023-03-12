//Time complexity: O(n^2)
//Space complexity: O(n)
//Technique: forward backward two pointer
public class ReverseVowels {
    // Given a string, reverse the order of the vowels in the string.
    public static void ReverseVowelsFunct (String s) {
        // To solve this one, we need to use a string comparsion logic
        // We need to solve the problem using a forward backward two pointer technique
        StringBuilder string = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int k = string.length() - 1;
        //Run throughout given string
        for (int i = 0; i < string.length() - 1; i++) {// Goes forwards

            for (int j = 0; j < vowels.length() - 1; j++) {// Goes throught vowels
                if (string.charAt(i) == vowels.charAt(j)) {// If found a vowel, break
                    break;
                }
            }

            while (k > i) {// Goes backwards string
                for (int j = 0; j < vowels.length() - 1; j++) {// Goes throught vowels
                    if (string.charAt(k) == vowels.charAt(j)) {// If found a vowel
                        char tmp = string.charAt(i);// Set temporary
                        string.setCharAt(i, string.charAt(k));// Replace the vowel found
                        string.setCharAt(k, tmp); // Replace the first vowel at the end
                        break;
                    }
                }
                k--;
            }
        }
    System.out.println(string);
    }
    public static void main(String[] args) throws Exception {
        // Input String: "Uber Career Prep"
        // Modified String: "eber Ceraer PrUp"
        ReverseVowelsFunct("Uber Career Prep");   
    }
}
//40 minutes to solve, not working properly
