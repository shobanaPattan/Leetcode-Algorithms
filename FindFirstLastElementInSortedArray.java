import java.util.Arrays;

public class FindFirstLastElementInSortedArray {

    static int[] findFirstLastElement(int[] arr, int target) {

        int[] res = new int[2];
        int left = leftBinarySearch(arr, target);
        int right = rightBinarySearch(arr, target);

        res[0] = left;
        res[1] = right;
        return res;
    }

    public static int leftBinarySearch(int[] arr, int target) {

        int start = 0;
        int index = -1;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static int rightBinarySearch(int[] arr, int target) {

        int start = 0;
        int index = -1;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10};
        int target = 11;

        System.out.println(Arrays.toString(findFirstLastElement(arr, target)));
    }
}


////Input - array and target, output - array of indices
//Create an empty array of size 2 store the result
//Find for first and last element index
//For left - find mid, initialize a variable index, then start searching the element in the left part of the array
//For right - find mid, initialize a variable index, then start searching the element in the right part of the array