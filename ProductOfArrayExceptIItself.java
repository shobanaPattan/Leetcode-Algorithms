public class ProductOfArrayExceptIItself {

    public static int[] productOfArrayExceptItself(int[] arr){

        int[] ans = new int[arr.length];
        int left = 1;
        int right = 1;

        for(int i=0; i<arr.length; i++){
            ans[i]=left;
            left=left*arr[i];
        }

        for(int i=arr.length-1; i>=0; i--){
            ans[i]=ans[i]*right;
            right=right*arr[i];
        }
        return  ans;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4};

        System.out.println(productOfArrayExceptItself(arr));
    }

}