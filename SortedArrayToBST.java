public class SortedArrayToBST {

    static TreeNode sortedArrayToBST(int[] nums) {

        if (nums.length == 0) {
            return null;
        }

        return createBST(nums, 0, nums.length-1);
    }

    public static TreeNode createBST(int[] nums, int low, int high){

        if(low > high){
            return null;
        }

        int mid = (low + high)/2;

        TreeNode node = new TreeNode(mid);

        node.left = createBST(nums, 0,mid-1);
        node.right = createBST(nums, mid+1, high);

        return node;
    }

    public static void main(String[] args){

        TreeNode root = new TreeNode();
        int[] nums = {0,1,2,3,4,5,6};

        System.out.println(sortedArrayToBST(nums));
    }
}

//Convert sorted array(Ascending order) to BST
//Check if the length og the array is equal to 0 if yes then return null
//Use recursion to find the BST
//Given array, low and high as the parameters
//Find the mid-point of the array and assign it as root
//Use recursion to the values of root.left and root.right