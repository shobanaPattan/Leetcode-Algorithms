import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    static int longestConsecutiveSequence(int[] arr) {

        int max = 1;

        if (arr.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int x : set) {

            if (!set.contains(x - 1)) {

                int current = x;
                int count = 1;

                while (set.contains(current + 1)) {

                    current = current + 1;
                    count = count + 1;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};

        System.out.println(longestConsecutiveSequence(arr));

    }
}


//Create HashSet to store all the elements
//Initialize count and max to 0
//Take first element and try to find its previous element in the set
//Create while loop and start searching each element and increment count value by 1 if that element exits in Set
//Return the count value