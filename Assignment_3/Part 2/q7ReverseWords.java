import java.util.ArrayList;

public class q7ReverseWords {
// Question 7: ReverseWords
// Given a string, return the string with the order of the space-separated words reversed
// Time Complexity: O(n)
// Space Complexity: O(n)
// Technique: Simple traversal
// Time Elapsed: 25min
    public static String reverse(String s){
        ArrayList<String> ordered = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr!=' ' ){
                word.append(curr);
            }else{
                ordered.add(word.toString());
                word.delete(0, word.length());
            }
            if(i==s.length()-1){
                ordered.add(word.toString());
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = ordered.size()-1; i >= 0; i--) {
            result.append(ordered.get(i));
            result.append(" ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        //Input 1: Uber Career Prep
        String input1 = "Uber Career Prep";
        //Output 1: Prep Career Uber
        System.out.println(reverse(input1));

        //Input 2: Emma lives in Brooklyn, New York.
        String frase = "Emma lives in Brooklyn, New York.";
        //Output 2: York. New Brooklyn, in lives Emma
        System.out.println(reverse(frase));
        
    }

}
