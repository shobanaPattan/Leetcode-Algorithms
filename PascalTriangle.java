import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {

    static List<List<Integer>> pascalTriangle(int rownum) {

//        List<List<Integer>> ans = new ArrayList<>();
//
//         for (int i = 0; i < rownum; ++i) {
//             Integer[] temp = new Integer[i + 1];
//             Arrays.fill(temp, 1);
//             ans.add(Arrays.asList(temp));
//         }
//
//         for (int i = 2; i < rownum; ++i) {
//             for (int j = 1; j < ans.get(i).size() - 1; ++j)
//                 ans.get(i).set(j, ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
//         }
//         return ans;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        List<Integer> row = new ArrayList<Integer>();

        for (int i = 0; i < rownum; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            ans.add(new ArrayList<>(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr = 4;

        System.out.println(pascalTriangle(arr));

    }

}
