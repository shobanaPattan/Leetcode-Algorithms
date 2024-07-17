public class SymmetricTree {

    public static boolean isTreeSymmetric(TreeNode root){

        if(root == null){
            return  true;
        }

       return symmetricTree(root.left, root.right);
    }

    public static boolean symmetricTree(TreeNode leftNode, TreeNode rightNode){

        if((leftNode == null) && (rightNode == null)){
            return true;
        }

        if((leftNode == null) || (rightNode == null)){
            return false;
        }

        if(leftNode.val != rightNode.val){
            return false;
        }

        return symmetricTree(leftNode.right, rightNode.left) && symmetricTree(leftNode.left, rightNode.right);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(1);

        System.out.println(isTreeSymmetric(root));
    }
}

//Input - TreeNode, Output - Boolean
//Check if the root is null, if yes then return null
//Create a method to check the tree is symmetric
//Check if both right and left nodes are null, if yes then return TRUE
//Check if one of the nodes(Right OR Left) is null, if yes then return FALSE
//Check the both nodes value are same, if yes then return TRUE
//Use recursion for both nodes where 1.Check for right node left child to right node right child and vice-versa