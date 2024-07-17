public class PathSumBST {

    static boolean hasPathSum(TreeNode node, int target) {

        if (node == null) {
            return false;
        }

        return pathSumResult(node, target);
    }

    static boolean pathSumResult(TreeNode root, int target){

        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null){
            if(target == root.val){
                return true;
            }else
                return false;
        }

        return pathSumResult(root.left, target- root.val) || pathSumResult(root.right, target- root.val);
    }

    public static void main(String[] args){

        TreeNode node = new TreeNode(5);
        node.right = new TreeNode(4);
        node.left = new TreeNode(11);
        node.left.left = new TreeNode(7);
//        node.left.left.right = new TreeNode(2);

        System.out.println(hasPathSum(node, 9));
    }
}

//PathSum - Given a root and target, return true if the tree has a root-to-leaf path
// such that adding up all the values along the path equals targetSum.
//Input - TreeNode and target, output - boolean
//Check if the root is null, if yes then return FALSE
//Check if both left and right nodes are null, if yes then check root.val == target, if yes then return TRUE
//Use recursion for left and right nodes