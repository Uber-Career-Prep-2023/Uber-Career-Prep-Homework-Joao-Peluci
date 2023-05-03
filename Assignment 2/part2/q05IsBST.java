package part2;

//Given a binary tree, determine if it is a binary search tree.

//Time Complexity: O(2^n)
//Space Complexity: O(n*m)
//15min first part
//20min second part

public class q5IsBST {
    public class Node {
        Node right;
        Node left;
        int data;

        Node(int value) {
            data = value;
            right = null;
            left = null;
        }
    }
    public boolean isValidBST(Node root) {
        /* For checking if isValidBST, left.val needs to have lower value than root.val
         * rigth.val needs to have greater value than root.val
         * So, when reach a leaf, return true, because it has passed our tests
         * Else, keep searching until false;
         */

        if (root.left != null) {
            if (root.left.data >= root.data) {
                return false;
            }
        }
        if (root.right != null) {
            if (root.right.data <= root.data)
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

    public boolean isValidBST2(Node root) {
        return isBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    boolean isBST(Node root, long max, long min) {
        if (root == null) {
            return true;
        }

        if (root.data >= max || root.data <= min) {
            return false;
        }

        boolean left = isBST(root.left, root.data, min);
        boolean right = isBST(root.right, max, root.data);

        return left && right;
    }
}