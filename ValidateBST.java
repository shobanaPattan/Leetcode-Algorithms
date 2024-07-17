public class ValidateBST {

    static boolean isBSTValid(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validateBST(TreeNode root, long MIN_VALUE, long MAX_VALUE) {

        if (root == null) {
            return true;
        }

        if (root.val >= MAX_VALUE || root.val <= MIN_VALUE) {
            return false;
        }

        return validateBST(root.left, MIN_VALUE, root.val) && validateBST(root.right, root.val, MAX_VALUE);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(0);

        System.out.println(isBSTValid(root));
    }
}


//Input - TreeNode, MAX_VALUE, MIN_VALUE  Output - Boolean(True or False)
//Check if the root is null, if yes then return true
//Validate the root value should not exceed MAX and Not Lesser than MIN, one of this condition passes then return false
//Use recursion for left and right nodes
