import java.util.ArrayList;

public class q2Boggle {
    // Boggle is a word game in which players compete to find the most words on a
    // square grid of random letters. Valid words must be at least three characters
    // and formed from non-overlapping (i.e., a position on the board can only be
    // used once in a word) adjacent (including diagonal) letters. Given a Boggle
    // board and a dictionary of valid words, return all valid words on the board.

    public static ArrayList<String> boggleVerify(String[] dictionary, char[][] board) {
        
        ArrayList<String> result = new ArrayList<>();
        for (String string : dictionary) {
            char[][] tempBoard = board.clone();
            for (int i = 0; i < string.length(); i++) {
                for (int j = 0; j < tempBoard.length; j++) {
                    for (int k = 0; k < tempBoard[j].length; k++) {
                        if (tempBoard[j][k] == string.charAt(i)) {
                            // Has found our character
                            // Replace it by *
                            System.out.println("Found " + tempBoard[j][k]);
                            tempBoard[j][k] = '*';
                            System.out.println(board[j][k]);
                        }
                    }
                }
            }
        }
        // Our input board is a 3x3 board with characters. For checking if a word is
        // inside it, we can use bruteforce
        // Run a for loop in the size of the amount of words.
        // Entering a word, we look for the first character inside the board from left
        // to right, top to bottom
        // If we found the character, we'll go to the next character of word and look if
        // its there is a valid neighbour (not visited) which character
        // Matches the current character, if it does, goes to this character and puts
        // the position in a visited temporary set (or simply replace the visited
        // character for *).
        // This process will be done until the condition of not reaching a valid
        // neighbour is matched or the word is exhausted.
        // If the word is exhausted (reaches the last character) we can add up the word
        // to our result arraylist.
        return result;
    }

    public static void main(String[] args) {
        // 20% done
        // Strategy: Bruteforce (but it should use DP)
        // Time Complexity = O(n*m*l)
        // Space Complexity O(n2)
        // Time elapsed: 40min

        // String[] dictionary = {
        //         "Ace", "Ape", "Cape", "Clap", "Clay", "Gape", "Grape",
        //         "Lace", "Lap", "Lay", "Mace", "Map", "May", "Pace",
        //         "Pay", "Rap", "Ray", "Tap", "Tape", "Trace", "Trap", "Tray", "Yap"
        // };

        String[] dictionary2 = {
                "Ace", "D"
        };

        char[][] board = {
                { 'A', 'D', 'E' },
                { 'R', 'C', 'P' },
                { 'L', 'A', 'Y' }
        };

        boggleVerify(dictionary2, board);

    }
}
