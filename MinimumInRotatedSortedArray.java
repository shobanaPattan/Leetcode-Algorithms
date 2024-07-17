public class MinimumInRotatedSortedArray {

    static int minimumInRotatedSortedArray(int[] arr){

        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mid = left + (right - left)/2;

            if(arr[mid]>arr[right]){
                left = mid+1;
            }else {
                right = mid;
            }
        }
     return arr[left];
    }

    public static void main(String[] args){

        //int[] arr = {11,13,15,17};
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(minimumInRotatedSortedArray(arr));
    }
}

//Initialize the start and end of the array as 0 and length-1 respectively
//Create while loop comparing the start and end of the array and find middle point
//Compare middle element and end of the array and update the start and end values accordingly
//Return the start element value