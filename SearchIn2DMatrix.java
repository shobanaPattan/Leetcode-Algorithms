import java.util.ArrayList;
import java.util.List;

public class SearchIn2DMatrix {

    static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;
            int mid_value = matrix[mid / col][mid % col];

            if (mid_value == target) {
                return true;
            } else if (mid_value < target) {
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return false;
    }

    public static void main(String[] args){

        //List<List<Integer>> matrix;

        int matrix[][] = {{1,2,3}, {4,5,6},{7,8,9}};

        System.out.println(searchMatrix(matrix, 10));

    }
}

//Input - matrix, output - integer
//Initialize row, col, start and end
//Check if matrix.length is 0, if yes return false
//While condition check start < end
//Find mid and mid-value
//Check if mid-value == target, if yes return true
//else change start and end values accordingly
