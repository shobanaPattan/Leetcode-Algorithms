import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderBST {

    //Using two Stacks
    public static List<Integer> postOrderBSTUsingStack(TreeNode root){

        List<Integer> postOrder = new ArrayList<Integer>();

        Stack<TreeNode> S1 = new Stack<>();
        Stack<TreeNode> S2 = new Stack<>();

        if(root == null){
            return postOrder;
        }

        S1.push(root);

        while(!S1.isEmpty()){

            root = S1.pop();
            S2.push(root);

            if(root.left != null){
                S1.push(root.left);
            }

            if(root.right != null){
                S1.push(root.right);
            }
        }

        while (!S2.isEmpty()){
            postOrder.add(S2.pop().val);
        }
        return postOrder;
    }

    //Using only Recursion

    public static List<Integer> postOrderUsingRecursion(TreeNode root){

        List<Integer> postOrderList = new ArrayList<>();

         postOrder(root, postOrderList);
         return postOrderList;
    }

    public static void postOrder(TreeNode root, List<Integer> postOrderList){

        if(root == null){
            return ;
        }

        postOrder(root.left, postOrderList);
        postOrder(root.right, postOrderList);
        postOrderList.add(root.val);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.right.left = new TreeNode(4);
//        root.right.right = new TreeNode(5);

//        System.out.println(postOrderBSTUsingStack(root));

        System.out.println(postOrderUsingRecursion(root));
    }
}

//Using Two Stacks :
//                    1.Input - two stacks, TreeNode, List Output - list
//                    2.Check if treeNode is not full, if yes then return Empty List
//                    3.Push root to S1 stack
//                    4.Use while loop saying S1 stack is not empty, pop the S1 Stack item and push to S2 stack
//                    5.Check for left node and push to S1 Stack and similarly to right node and close while loop
//                    6.Use another while loop saying S2 Stack is not empty and pop all the S2 stack values to list and return the same list

//Using Recursion:
//                    1.Input - TreeNode, List, Output -List
//                    2.Check if the root is null, if yes then return empty List
//                    3.Use recursion for left and right nodes then add the root value at the end