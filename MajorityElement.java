import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        n = n / 2;

        for (Map.Entry<Integer, Integer> mm : map.entrySet()) {
            if (mm.getValue() > n) {
                return mm.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1};
        System.out.println(majorityElement(arr));
    }
}


//Create a hash map table to store the key and values
//Insert the elements in the table
//Compare the element which appears more than n/2 else return 0





