public class BiggestElement {

    static int biggestElement(TreeNode node) {

        if (node == null) {

            throw new RuntimeException("Input is invalid");
        }

        return getBiggestElement(node);
    }

    static int getBiggestElement(TreeNode root) {

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        if (root.left != null) {
            left = getBiggestElement(root.left);
        }

        if (root.right != null) {
            right = getBiggestElement(root.right);
        }

        return Math.max(root.val, Math.max(left, right));
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(89);
        root.left = new TreeNode(17);
        root.left.right = new TreeNode(11);

        System.out.println(getBiggestElement(root));

    }

}
