import java.util.ArrayList;
import java.util.List;

public class LevelOrderTraversal {

    static  List<List<Integer>> levelOrderTraversal(TreeNode root){

        List<List<Integer>> result = new ArrayList<>();

        traversal(root, 0, result);
        return result;
    }

    public static void traversal(TreeNode root, int level, List<List<Integer>> result){

        if(root == null){
            return;
        }

        if(level == result.size()){
            result.add(new ArrayList<>());
        }
            result.get(level).add(root.val);

        traversal(root.left, level+1, result);
        traversal(root.right, level+1, result);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(6);

        System.out.println(levelOrderTraversal(root));
    }
}

//Input - TreeNode,level of Tree, Output - List of list integers(ArrayList)
//Check if the root is null, if yes then return empty
//Check the size of the ArrayList == level of the Tree, if condition works then create new ArrayList
//Add root value to the ArrayList by using get.level
//Use recursive method to both left and right nodes of the tree
