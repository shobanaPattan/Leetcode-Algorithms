public class SumRootToLeafNumbers {

    static int sumOfRootToLeafNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public static int sum(TreeNode root, int sum) {

        if (root == null) {
            return 0;
        }

        sum = root.val + (sum * 10);

        if (root.left == null && root.right == null) {
            return sum;
        }

        return sum(root.left, sum) + sum(root.right, sum);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);
//        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);

        System.out.println(sumOfRootToLeafNumbers(root));
    }
}

//Input - TreeNode, int variable assign to '0', Output - Sum of root of leaf numbers(int 32 bit)
//Check if the root is null, if yes return 0
//Calculate the sum of all root leaf numbers, sum = root.val + (sum*10)
//Use Recursion for both left and right nodes