public class SumOfLeftLeavesNumbers {

    static int sumOfLeftLeaves(TreeNode root) {
        return sum(root);
    }

    public static int sum(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int ans = 0;

        if (root.left != null && root.left.left == null && root.left.right == null) {
            ans += root.left.val;
        }

        ans += sum(root.left);
        ans += sum(root.right);

        return ans;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(5);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(10);
        root.right.left = new TreeNode(10);

        System.out.println(sumOfLeftLeaves(root));
    }
}

//Input - TreeNode, Output - Sum of all left leaf nodes where children are null
//Check if the root is NULL, is yes then return 0
//Create a variable of int type 'ans' and assign it to 0
//Check the 3 condition: when root.left is not NULL, root.left.right and root.left.left are NULL
//If above condition is satisfy then return ans += root.left.val
//Use recursion for left and right root nodes, ans += (root.left) and ans += (root.right)
//Finally return ans