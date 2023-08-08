import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class q6WordBreak {
    // Given a string of characters without spaces and a dictionary of valid words,
    // determine if it can be broken into a list of valid words by adding spaces.

    public static boolean wordBreak(Set<String> dict, String s) {

        // I need to check whether the word s can be divided into words contained into
        // the set
        // Running a for loop inside the word s until it forms a word contained in the
        // set, then break the s word until it has no characters or the word is
        // exhausted
        StringBuilder tmpWord = new StringBuilder();
        ArrayList<String> wordsFound = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            tmpWord.append(s.charAt(i));
            if (dict.contains(tmpWord.toString())) {
                wordsFound.add(tmpWord.toString());
                System.out.println(tmpWord);
                tmpWord = new StringBuilder();
            }
        }
        StringBuilder wordsString = new StringBuilder();
        for (String string : wordsFound) {
            wordsString.append(string);
        }
        if (s.equals(wordsString.toString())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        // 50% done
        // Strategy: 
        // Time complexity O(n)
        // Space complexity O(n)
        // Time elapsed: 25min
        Set<String> words = new HashSet<>();
        words.add("elf");
        words.add("go");
        words.add("golf");
        words.add("man");
        words.add("manatee");
        words.add("not");
        words.add("note");
        words.add("pig");
        words.add("quip");
        words.add("tee");
        words.add("teen");

        String input = "mangolf";


        boolean var = wordBreak(words, input);
        System.out.println(var);

    }
}
