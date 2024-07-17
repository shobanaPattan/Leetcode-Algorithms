public class MinimumSize_LengthSubarraySum {

    static int findMinSize(int[] arr, int target){

        int i = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int j = 0; j < arr.length; j++){

            sum = sum + arr[i];

            while (sum >= target) {
                 sum = sum - arr[i];
                 min = Math.min(min, j-i+1);
                 i++;
            }
        }

        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }

    public static void main(String[] args){

        int arr[] = {1,1,1};

        System.out.println(findMinSize(arr,25));
    }
}

//Minimum SubArray Sum - Given an array a target, find the minimum length of the array were added to become the target else return 0
//Input - Array and target(Int) , Output - int
//Initialize two variables as two pointers to 0, one variable to find MinSize to = Max_Value and sum to 0
//For loop to go through each element in an array and find sum
//While loop to find whether sum >= target and find min