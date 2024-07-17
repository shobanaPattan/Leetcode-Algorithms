public class MissingElementInSortedArray {

    static int findMissingElement(int[] arr) {

        if(arr[0] != 1){
            return 1;
        }
        if(arr[arr.length-1] != arr.length+1){
           return arr.length+1;
        }
        int start = 0;
        int end = arr.length - 1;

        while ((end - start) > 1) {

            int mid = (start + end) / 2;

            if ((arr[start] - start) != (arr[mid] - mid)) {
                end = mid;
            } else if ((arr[end] - end) != (arr[mid] - mid)) {
                start = mid;
            }
        }
        return (arr[start] + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.println(findMissingElement(arr));
    }
}

//Input - array, output - int
//Using Binary Search find mid-element
//Check mid with start and end elements and change start and end values accordingly
//arr[start]-start != arr[mid]-mid then b = mid else a = mid