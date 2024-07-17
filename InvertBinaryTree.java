public class InvertBinaryTree {

    public static TreeNode invertTree(TreeNode root){

        invert(root);
        return root;
    }

    static void invert(TreeNode root){

        if(root == null){
            return ;
        }

        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invert(root.right);
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        
        System.out.println(invertTree(root));
    }
}
