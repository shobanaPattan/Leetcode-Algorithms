import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementBST {
     static int kthsmallestNumber(TreeNode node, int k) {

        List<Integer> inorder = new ArrayList<>();

        if (node == null) {
            throw new RuntimeException("Invalid Input");
        }

        smallestElement(node, inorder);
        return (inorder.get(k - 1));
    }
     static void smallestElement(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }

        smallestElement(root.left, list);
        list.add(root.val);
        smallestElement(root.right, list);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);

        System.out.println(kthsmallestNumber(root, 2));
    }
}
