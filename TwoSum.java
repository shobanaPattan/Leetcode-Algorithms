import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 21;

        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
}

//To sum - Given a target find the indices of while adding equals to target
//Input - array and a target, output - array(Indices)
//Create a hashmap
//Subtract target with each array element and store in a hashmap until the subtracted number and then return both indices