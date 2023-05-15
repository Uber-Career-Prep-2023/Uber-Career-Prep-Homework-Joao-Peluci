import implementations.TreeNode;

//Given a binary tree, determine if it is a binary search tree.

//Time Complexity: O(2n)=O(n)
//Space Complexity: O(n*m)
//15min first part
//20min second part


public class q05IsBST {

    public boolean isValidBST(TreeNode root) {
        /* For checking if isValidBST, left.val needs to have lower value than root.val
         * rigth.val needs to have greater value than root.val
         * So, when reach a leaf, return true, because it has passed our tests
         * Else, keep searching until false;
         */

        if (root.left != null) {
            if (root.left.val >= root.val) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.right.val <= root.val)
                return false;
        }

        if (root.right != null)
            isValidBST(root.right);
        if (root.left != null)
            isValidBST(root.left);

        return true;

    }

    /* This question was in my Meta Interview. My solution was something like above.
    *  Looked up on leetcode and it doesn't work
    *  So I searched for doing something that works, found out that I need to store
    *  values for max or min for the trees, depending if it's left based or right based.
    *  The solution below was made for me, but I needed to read some submissions from other people 
    */

    public static boolean isValidBST2(TreeNode root) {
        return isBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    public static boolean isBST(TreeNode root, long max, long min) {
        if (root == null) {
            return true;
        }

        if (root.val >= max || root.val <= min) {
            return false;
        }

        boolean left = isBST(root.left, root.val, min);
        boolean right = isBST(root.right, max, root.val);

        return left && right;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
    
        System.out.println(isValidBST2(root));
    }
    
}