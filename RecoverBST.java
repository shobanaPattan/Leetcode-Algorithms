public class RecoverBST {

     TreeNode first = null;
      TreeNode second = null;
      TreeNode previous = null;

    public void recoverBST(TreeNode root){

        if(root == null){
            return;
        }

        bstRecover(root);

        //Swapping first and second wrong nodes
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

    }

    public void bstRecover(TreeNode root){

        if(root == null){
            return;
        }

        bstRecover(root.left);

        //To find first wrong node
        if(first == null && (previous == null || previous.val >= root.val)){
            first = previous;
        }

        //To find second wrong node
        if(first != null && previous.val >= root.val){
            second = root;
        }

        previous = root;
        bstRecover(root.right);
    }

    public void main(String[] args){

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(2);

//        System.out.println(recoverBST(root));
    }
}

//Input - TreeNode (Private - First, Second and Previous)
//Create 3 private TreeNodes and assign to NULL
//Create a method to recover the TreeNode by swapping two nodes
//Create a method to find first and second wrong position nodes
