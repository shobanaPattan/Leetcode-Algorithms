import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class ZigZagTraversal {

    static List<List<Integer>> zigZagLevelTraversal(TreeNode node) {

        List<List<Integer>> result = new ArrayList<>();

        levelTraversal(node, result, 0);
        return result;
    }

    static void levelTraversal(TreeNode root, List<List<Integer>> result, int level) {

        if (root == null) {
            return;
        }

        if (result.size() <= level) {

            List<Integer> newLevel = new LinkedList<>();
            result.add(newLevel);
        }

        List<Integer> collections = result.get(level);

        if (level % 2 == 0) {
            collections.add(root.val);
        } else
            collections.add(0, root.val);

        levelTraversal(root.left, result, level + 1);
        levelTraversal(root.right, result, level + 1);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode();
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);

        System.out.println(zigZagLevelTraversal(root));
    }
}

//ZigZag Traversal - level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between)
//Input - TreeNode , int level = initially its 0, List of List<Integer>(result) output - list of list<Integer>
//Create a method ZigZagTraversal and check if the root is null, is yes then return empty list
//Check condition List<List<Integer>> is <= level oder, if yes then create LinkedList
//Assign the created LinkedList to List<List<Integer>>
//Create one more List<Integer>>(collections) and assign the List<List<Integer>>.get(level) (or) value of current level
//Check if(level % 2 == 0) then add current root value to collections list else add(0, cur root.val) to collections
//Use recursion for both right and left nodes increasing level+1