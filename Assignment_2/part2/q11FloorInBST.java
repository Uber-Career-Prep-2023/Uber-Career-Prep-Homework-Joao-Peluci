import implementations.TreeNode;
// Given a target numeric value and a binary search tree, return the floor
// (greatest element less than or equal to the target) in the BST.

//Tried for more than 60min.
public class q11FloorInBST {
    public static int floorInBST(TreeNode root, int target) {
        if (root==null) return 0;

        //For solving this exercise, we'll need to iterate over the tree
        //if (root.right.val>target), goes one layer down the tree on left arm
        //else, goes on right arm
        
        if (root.right.val>target){
            return floorInBST(root.right, target);
        }
        else return floorInBST(root.left, target);

    }
}
