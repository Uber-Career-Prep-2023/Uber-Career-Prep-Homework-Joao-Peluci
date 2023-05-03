
class BinarySearchTree {
    public class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode() {}
        public TreeNode(int val) { this.val = val; }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode root;
    int min(TreeNode root){ // returns the minimum value in the BST
        //Go into the left branch of the tree until left is null
        if (root.left!=null){
            return min(root.left);
        }
        return root.val;
    };
    int max(TreeNode root){ // returns the maximum value in the BST
        if (root.right!=null){
            return max(root.right);
        }
        return root.val;
    }; 
    boolean contains(TreeNode root, int val){// returns a boolean indicating whether val is present in the BST
        if(root.val==val){
            return true;
        }
        if(root.val>val){
            return contains(root.right, val);
        }
        if(root.val<val){
            return contains(root.left,val);
        }

        return false;
    }; 
    // For simplicity, do not allow duplicates. If val is already present, insert is a no-op
    void insert(int val){
    //Couldn't implement, needed to search online to understand
    }; // creates a new Node with data val in the appropriate location
    int delete(int val){
        //Couldn't implement, needed to search online to understand
        return 0;
    }; // deletes the Node with data val, if it exists
}

