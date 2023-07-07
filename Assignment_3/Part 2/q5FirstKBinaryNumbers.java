import java.util.ArrayList;
// Time Complexity: O(n*log(n))
// Space Complexity: O(n)
// Technique: Simple traversal
// Time Elapsed: 25min
public class q5FirstKBinaryNumbers {
    public static ArrayList<String> toBinaryArray(int k) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(toBinary(i));
        }
        return result;
    }

    public static String toBinary(int k) {
        StringBuilder word = new StringBuilder();
        char tmp;
        if (k==0){
            tmp = '0'; //Put 0
            word.append(tmp);
        }
        while(k > 0){
            if (k % 2 == 0){
                tmp = '0'; //Put 0
                k = k/2;
            }
            else{
                tmp = '1'; //Put 1
                k = (k-1)/2;
            }
            word.insert(0, tmp);
        }
        
        return word.toString();
    }
    public static void main(String[] args) {
        //Test 1
        int k = 5;
        System.out.println(toBinaryArray(k));

        //Test 2
        int k2 = 10;
        System.out.println(toBinaryArray(k2));
        
    }
}
