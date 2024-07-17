import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    static List<List<Integer>> combinationSum(int[] arr, int target){

        List<List<Integer>> ans = new ArrayList<>();

        findCombinations(0, arr, ans, new ArrayList<>() , target);
        return ans;
    }

    static void findCombinations(int index, int[] arr, List<List<Integer>> ans, List<Integer> temp, int target){

        if(target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = index; i< arr.length;i++){

            temp.add(arr[i]);
            findCombinations(i,arr,ans,temp,target-arr[i]);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){

        int arr[] = {2,3,5};
        int target = 7;

        System.out.println(combinationSum(arr, target));
    }
}
