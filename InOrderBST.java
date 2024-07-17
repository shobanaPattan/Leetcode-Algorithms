import java.util.ArrayList;
import java.util.List;

public class InOrderBST {

    static List<Integer> inOrderBST(TreeNode root) {

        List<Integer> inOrder = new ArrayList<Integer>();
        return bstInOrder(root, inOrder);
    }

    public static List<Integer> bstInOrder(TreeNode root, List<Integer> inorder) {

        if (root != null) {
            bstInOrder(root.left, inorder);
            inorder.add(root.val);
            bstInOrder(root.right, inorder);
        }
        return inorder;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(inOrderBST(root));
    }
}

//Input - TreeNode, List<Integer>, Output - List<Integer>
//If root is not null, then use recursion for left and add the value of it and right part recursion