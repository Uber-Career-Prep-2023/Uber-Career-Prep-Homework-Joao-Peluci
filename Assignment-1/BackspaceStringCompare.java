//Time Complexity: O(n);
//Space Complexity: O(n*m), input size=n*m
//Technique: Two pointer iteration
public class BackspaceStringCompare {
    //Given two strings representing series of keystrokes, determine whether the resulting text is the same. Backspaces are represented by the '#' character so "x#" results in the empty string ("").
    public static boolean backspaceStringCompareFunc(String input, String compareInput) {
        StringBuilder inputSB = new StringBuilder(input);
        StringBuilder compareInputSB = new StringBuilder(compareInput);
        
        for (int i = 0; i < inputSB.length(); i++) {
            if(inputSB.charAt(i)=='#'){
                inputSB.deleteCharAt(i);
                inputSB.deleteCharAt(i-1);
            }
        }

        for (int i = 0 ; i < compareInputSB.length() ; i++) {
            if (compareInputSB.charAt(i)=='#'){
                compareInputSB.deleteCharAt(i);
                compareInputSB.deleteCharAt(i-1);
            }
        }

        String output1 = inputSB.toString();
        String output2 = compareInputSB.toString();
        if (output1.length()==output2.length()){
            if (output1.equals(output2)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String input = "ab##";
        String compareInput = "c#d#";
        System.out.println(backspaceStringCompareFunc(input,compareInput));
       
    }
}
//36 min to solve
