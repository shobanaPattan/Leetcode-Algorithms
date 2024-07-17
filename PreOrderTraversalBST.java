import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversalBST {

    static List<Integer> preOrderTraversal(TreeNode root) {

        List<Integer> preOrder = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        if (root == null) {
            return preOrder;
        }

        stack.push(root);

        while (!stack.isEmpty()) {

             root = stack.pop();
            preOrder.add(root.val);

            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return preOrder;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.left.left = new TreeNode(3);
//        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);

        System.out.println(preOrderTraversal(root));

    }
}

//Create List and Stack
//Check if the root is Null, if yes then return empty list
//Push the root into Stack
//Check the while condition until Stack is empty
//Pop the stack and reassign to root
//Add the popped root val to list
//Check right and left root nodes
//Return the list