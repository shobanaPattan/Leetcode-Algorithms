public class FindPeakElement {

    static int findPeakElement(int[] arr){

        int n = arr.length;

        if(n==1){
            return 0;
        }

        if(arr[0] > arr[1]){
            return 0;
        }

        if(arr[n-1]>arr[n-2]){
            return n-1;
        }

        int start = 1;
        int end = n-2;

        while(start<=end){
            int mid = start+(end-start)/2;

            if((arr[mid]>arr[mid-1]) && (arr[mid]>arr[mid+1])){
                return mid;
            }else if(arr[mid]<arr[mid-1]){
                end = mid-1;
            } else if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] arr = {1,2,1};

        System.out.println(findPeakElement(arr));
    }
}

//Check when length = 1 if true return 0
//Check between index 0 and index 1, if index 0 is greater, then return 0
//Check between index length-1 and length-2, if index length-1 is greater, then return length-1
//Check between index 1 and length-2, find mid-element and compare with the neighbours if not true then update start and end elements
