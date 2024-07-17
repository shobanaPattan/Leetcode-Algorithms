import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] arr){

        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);

        if(arr.length <3){
            return new ArrayList<>();
        }

        for(int i = 0; i< arr.length-2; i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right){

                int sum = arr[i]+arr[left]+arr[right];

                if(sum == 0){
                    set.add(Arrays.asList(arr[i], arr[left],arr[right]));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args){
        int[] arr = {1,2,-3};

        System.out.println(threeSum(arr));
    }
}

//Three sum - given an array, return arrayList where adding three numbers = 0
//Input - array, output - list<List<Integers>
//Create a HashSet to store unique list of integers, sort the array
//For loop starts with 0 and ends with length - 2 (as comparing three numbers)
//Create left and right variables and start while looping
//Add three numbers(arr[i]+left+right) = 0 then add to Set
//if sum < 0 then left++ else right--