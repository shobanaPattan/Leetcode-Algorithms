public class MaximumProductSubarray{

     static int maxProductOfSubArray(int[] nums){
        int ans = nums[0];
        int max = ans;
        int min = ans;

        for(int i=1; i<nums.length;i++){
            if(nums[i]<0){

                int temp = max;
                max = min;
                min = temp;
            }
            max=Math.max(max*nums[i], nums[i]);
            min=Math.min(min*nums[i], nums[i]);

            ans=Math.max(max, ans);
        }
      return ans;
    }

    public static void main(String[] args){
        int[] num = {2,3,-1,4};

        System.out.println(maxProductOfSubArray(num));
    }
}


//Initialize a variable: answer to first index of the array
//Initialize max and min value of answer variable
//loop till array length to access each element
//If condition to check the element is negative i.e <0 ,if yes swap max and min(cause when you
// multiply with negative automatically max becomes min and min becomes max so)
//Find the max and min values n assign to variable answer