public class ShortestSubstring {
    //Given a string and a second string representing required characters, return the length of the shortest substring containing all the required characters.
    public static void shortestSubstringFunc(String input, String subString) {
        int minSize = subString.length();
        int i = 0;
        while (i<input.length()){
            int j = 0;
            StringBuilder aux = new StringBuilder(subString);
            int k = 0;
            while (j<minSize) {
                while (k<subString.length()){
                    if (input.charAt(j)==aux.charAt(k)){
                        aux.deleteCharAt(k);
                    }
                    k++;
                }
                j++;
            }
            if(aux.length()==0){
                System.out.println("Done"+minSize);
            }
            else {
                System.out.println("Error");
                minSize++;
            }
            i++;
        }




    }
    public static void main(String[] args) {
        //The smaller string we can find has a minimum size of the string given
        String input = "abracadabra";
        String subString = "abc";
        shortestSubstringFunc(input, subString);


    }
}
