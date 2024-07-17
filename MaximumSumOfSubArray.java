public class MaximumSumOfSubArray {

    static int maxSumOfSubArray(int[] arr){
        int max = arr[0];
        int ans = max;

        for(int i = 1; i<arr.length; i++){
            max = Math.max(max+arr[i], arr[i]);
            ans = Math.max(max, ans);
        }
        return ans;
    }

    public static void main(String[] args){

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSumOfSubArray(arr));
    }


}



//Initialize a variable answer to first index of array and max variable as same
//for loop to go through each element
//find the value for variable answer using Math.max
//and find the max sum of array and return