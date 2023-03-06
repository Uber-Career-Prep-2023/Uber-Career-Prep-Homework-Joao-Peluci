import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//Time complexity: O(n)
//Space complexity of algorithm: O(n)
public class MergeIntervals {
    // Given a list of integer pairs representing the low and high end of an
    // interval, inclusive, return a list in which overlapping intervals are merged.
    /*
     * Input: [(2, 3), (4, 8), (1, 2), (5, 7), (9, 12)]
     * Output: [(4, 8), (1, 3), (9, 12)]
     * 
     * Input: [(5, 8), (6, 10), (2, 4), (3, 6)]
     * Output: [(2, 10)]
     * 
     * Input: [(10, 12), (5, 6), (7, 9), (1, 3)]
     * Output: [(10, 12), (5, 6), (7, 9), (1, 3)]
     */
    public static void returnMerge(ArrayList<int[]> arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = arr.get(i)[0]; j <= arr.get(i)[1]; j++) {
                if (map.containsKey(j)){
                    map.put(j, map.get(j)+1);
                }
                else{
                    map.put(j, 1);
                }
            }
            
        }
        for (int i = 0; i < map.size(); i++) {
            if(map.get(i)==1){

            }
        }
        ArrayList<int[]> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int[] aux = new int[2];
            if (i==0){
                aux[0]=map.get(i);
            }
            else if()
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        ArrayList<int[]> arr = new ArrayList<>();
        int[] a = {2, 3};
        int[] b = {4, 8};
        int[] c = {1, 2};
        int[] d = {5, 7};
        int[] e = {9, 12};
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        returnMerge(arr);
        
    }
}
//40min
