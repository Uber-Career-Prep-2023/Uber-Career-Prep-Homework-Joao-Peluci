import implementations.TreeNode;

public class q04CopyTree{
    //I need to create a deep copy of a Binary Tree
        //I can use iterative or recursive modes
        //If I have a tree
        //I'll check: node.left != null
        //If null, returns the node
        //Else, goes inside it and copy
        /*
         *              2
         *             / \
         *            3   4
         *           /\
         *          5  7
         */
        //For this approach, recursive function will work, our core function simply
        //Copies the value of the node if the left and rigth node is null

    public static TreeNode copyTree(TreeNode node) {
        //25 min
        //Time complexity O(2n)=O(n);
        if (node == null) {
            return null;
        }
        TreeNode returnNode = new TreeNode(node.val); //Creates new tree keeping track of val

        //Not a leaf
        returnNode.left = copyTree(node.left); //Copies a tree inside left node
        returnNode.right = copyTree(node.right); //Copies a tree inside right node

        return returnNode; //Returns the formed Tree
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(7);
    
        TreeNode copy = copyTree(root);
        TreeNode.printTree(root);
        System.out.println();
        TreeNode.printTree(copy);
        
    }
}