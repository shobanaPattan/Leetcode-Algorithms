import java.util.Arrays;

public class RotateArray {

    public static void reverse(int[] arr, int left, int right){

        while(left<right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static int[] rotate(int[] arr, int k){

         k = k % arr.length;

         if(k<0){
             k=k+arr.length;
         }

         reverse(arr,0,arr.length-k-1); //part 1 reverse
         reverse(arr,arr.length-k,arr.length-1); //part 2 reverse
         reverse(arr,0,arr.length-1);//Whole array reverse

        return arr;
    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(rotate(arr, 3)));
    }

}

//Write a method/function to reverse the array values using while loop (left<right)
//Write a method/function to rotate using reverse method