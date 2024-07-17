public class MaxDepth {
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }


    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);

        TreeNode sonu = new TreeNode();
        sonu.left = new TreeNode(7);
//        System.out.println("sonu :" + sonu);
//        System.out.println("sonu.left: " + sonu.left);

//        TreeNode xy = new TreeNode(5, sonu, sonu);
//        System.out.println("xy.left: " + xy.left);

//        xy.left = new TreeNode(5);

//        System.out.println("xy.left: " + xy.left);
//        TreeNode xy = new TreeNode();
//        xy.val = 9;
//
//        TreeNode sonu = new TreeNode();
//        sonu.val = 28;
//        sonu.left = xy;
//        sonu.right = root;

        System.out.println(maxDepth(sonu));

    }
}
