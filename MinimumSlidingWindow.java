import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class MinimumSlidingWindow {

    static int[] minSlidingWindow(int[] arr, int k) {

        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        int ri = 0;
        int[] result = new int[n - k + 1];

        for (int i = 0; i < n; i++) {

            //remove numbers which out of k range
            if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }

            //remove small numbers in range k which are useless
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);
            if (i >= k - 1) {
                result[ri++] = arr[dq.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, -2, -3, 4, 5};

        System.out.println(Arrays.toString(minSlidingWindow(arr, 3)));
    }
}

//Create deque
//Initialise new array with range n-k+1(Output)
//for loop to access each element in an array
//Remove all the elements from deque which are out of k range
//remove smaller elements in the k range which are useless
//Add the a[i] to the deque
//add the new ArrayList