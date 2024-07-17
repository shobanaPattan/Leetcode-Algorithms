public class BalancedBST {

    static boolean balancedBST(TreeNode root){

        if(root == null){
            return true;
        }

        return height(root) != -1;
    }

    static int height(TreeNode node){

        if(node == null){
            return  0;
        }

        int leftHeight = height(node.left);
        if(leftHeight == -1){
            return  -1;
        }

        int rightHeight = height(node.right);
        if(rightHeight == -1){
            return  -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return  -1;
        }

        return 1+Math.max(leftHeight , rightHeight);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        System.out.println(balancedBST(root));
    }
}

//Check if the Tree is null, if yes then return true(balanced)
//Recursively check left and right nodes, if return -1 then return false(Not balanced)
