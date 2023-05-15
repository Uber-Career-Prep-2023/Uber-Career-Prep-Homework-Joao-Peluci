package implementations;

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

    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        
        // Print the current node
        System.out.print(node.val + " ");
        
        // Recursively print the left and right subtrees
        printTree(node.left);
        printTree(node.right);
    }
    

}