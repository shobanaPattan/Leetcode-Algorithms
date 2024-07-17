public class TrapRainWater {

    static int trapRainWater(int[] arr){

        int left = 0; int right = arr.length-1;
        int leftmax = 0; int rightmax = 0;
        int netwater = 0;

        while (left<right){
             leftmax= Math.max(leftmax,arr[left]);
             rightmax= Math.max(rightmax,arr[right]);

             if(leftmax<rightmax){
                 netwater=netwater+leftmax-arr[left];
                 left++;
             }else{
                 netwater=netwater+rightmax-arr[right];
                 right--;
             }
        }
       return  netwater;
    }

    public static void main(String[] args)
    {
        //int[] arr = {0,1,0,2,1,0,1,3,2,1,2,2};
        int[] arr = {1,0,2,1,1,3};
        System.out.println(trapRainWater(arr));
    }
}

//initialize left, right, leftmax, rightmax and netwater to '0'
//While loop till left<right and find leftmax and rigtmax
//Check condition if leftmax is lesser than rightmax and find newtwater
