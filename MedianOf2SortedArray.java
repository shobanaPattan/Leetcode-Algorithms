public class MedianOf2SortedArray {

    static double findMedian(int[] num1, int[] num2) {

        int n1 = num1.length;
        int n2 = num2.length;

        //Ensure num1 is smaller for simplicity
        if (n1 > n2) {
            return findMedian(num2, num1);
        }
        int n = n1 + n2;
        int left = (n1 + n2 + 1) / 2;
        int low = 0;
        int high = n1;

        while (low <= high) {
            int mid1 = (low + high) >> 1;
            int mid2 = left - mid1;

            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;

            if (mid1 < n1) {
                r1 = num1[mid1];
            }
            if (mid2 < n2) {
                r2 = num2[mid2];
            }

            if (mid1 - 1 >= 0) {
                l1 = num1[mid1 - 1];
            }
            if (mid2 - 1 >= 0) {
                l2 = num2[mid2 - 1];
            }

            if (l1 <= r2 && l2 <= r1) {
                //Calculate n is even or odd
                if (n % 2 == 1) {
                    return Math.max(l1, l2); //odd
                } else {
                    return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0; //even
                }
            } else if (l1 > r2) {
                high = mid1 - 1;
            } else {
                low = mid1 + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){

        int[] num1 = {1,3,4,7,10};
        int[] num2 = {2,3,6,15};

        System.out.println(findMedian(num1, num2));
    }
}

//Input - two arrays, output - double
//Initialize n, n1, n2, left, low, high, mid1, mid2, l1, l2, r1, r2
//Find all the variable values
//Check if l1 <= r2 and l2 <= r1, if l1 > r2 then high = mid1 -1 else low = mid1+1
//Check n is even or odd, if odd them mx(l1,l2) else max(l1,l2)+min(r1,r2)/2