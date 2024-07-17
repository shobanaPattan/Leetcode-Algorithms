import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static List<List<Integer>> subsets(int[] arr){

        List<List<Integer>> result = new ArrayList<>();

        backTrack(result, new ArrayList<>() , arr, 0);
        return result;
    }

    static void backTrack(List<List<Integer>> resultSet, List<Integer> tempList , int[] arr , int start){

        resultSet.add(new ArrayList<>(tempList));

        for(int i = start; i< arr.length; i++){

            tempList.add(arr[i]);
            backTrack(resultSet, tempList, arr , i+1);
            tempList.remove(tempList.size()-1);
        }
    }

    public static void main(String[] args){

        int[] arr = {1,2,3};

        System.out.println(subsets(arr));
    }
}

//Input : array , output : List<List<Integer>>
//Create a result empty arrayList
//Create a method to find the subsets(result list, new ArrayList tempList, arr[], initial value 0)
//Add tempList to result list
//For loop to go through each element in an array
//Add element to Result List
//Use recursion to find the subsets
//Remove the List by one size