public class FlattenBST {

    public static int flattenBST(TreeNode root){

        TreeNode previous = null;

        if(root == null){
            return 0;
        }

        flattenBST(root.right);
        flattenBST(root.left);

        root.right = previous;
        root.left = null;

        previous = root;
        return root.val;
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(flattenBST(root));
    }
}

//Flatten meaning - all the nodes(Complete TreeNode) ly on the right side
//Input - TreeNod and a variable(Previous) assign to NULL, Output - TreeNode(Right)
//Check if the root is Null, if yes then return
//Use recursive for left and right nodes
//Assign right to previous and left to null and previous to root