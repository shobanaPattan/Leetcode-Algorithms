public class LCAinBinaryTree {

    static TreeNode searchLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

//        if (root == null || root == p || root == q) {
//            return root;
//        }
//
//        TreeNode left = searchLowestCommonAncestor(root.left, p, q);
//        TreeNode right = searchLowestCommonAncestor(root.right, p, q);
//
//        if (root.left != null && root.right != null) {
//            return root;
//        }
//        if (root.left == null) {
//            return right;
//        } else {
//            return left;
//        }


        if (root == null)
            return null;

        if (root.val > p.val && root.val > q.val)
            return searchLowestCommonAncestor(root.left, p, q);

        // If both n1 and n2 are greater than root, then LCA
        // lies in right
        if (root.val < p.val && root.val < q.val)
            return searchLowestCommonAncestor(root.right, p, q);

        return root;

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);

        System.out.println(searchLowestCommonAncestor(root, root.left.left, root.left.right).val);
    }

}


//LCA - Lowest Common Ancestor (Intersection of two nodes, return it)
//Check if root is null or root = p or root = q then return root value
//Use recursion to check for TreeNode left and right
//Check if left = null then return right, if right = null then return left, if both are null then return root