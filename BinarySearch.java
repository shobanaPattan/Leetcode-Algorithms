import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class BinarySearch {

    static int findNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (mid < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;

        System.out.println(findNumber(arr, target));
    }
}

//Input - sorted array and target, output - int
//Initialize start and end variables
//while loop until start and end meets
//Find mid, if mid == target then return mid-index, if mid > target then start = mid+1 else end = mid - 1