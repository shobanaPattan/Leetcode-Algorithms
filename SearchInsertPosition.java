public class SearchInsertPosition {

    static int searchInsertPosition(int[] arr, int target){

        int start = 0;
        int end= arr.length-1;

        while(start <= end){

            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] > target) {
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return start;
    }
    public static void main(String[] args){

        int[] arr = {1,3,4,5};

        System.out.println(searchInsertPosition(arr, 2));
    }
}

//Input - array and target, output - int[index]
//Find the target index if found else find the index where target should be inserted
//Find mid then start find the element in left or right part of the array accordingly
//Else return start