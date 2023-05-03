package part2;

import part2.implementations.TreeNode;

public class q4CopyTree{
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
        //Time complexity O(2^n);
        TreeNode returnNode = new TreeNode(); //Creates new tree

        if (node.right == null && node.left==null){//If the current node is a leaf
            return node; //Returns the leaf
        }

        //Not a leaf
        if (node.left!=null) returnNode.left = copyTree(node.left); //Copies a tree inside left node
        if (node.right!=null) returnNode.right = copyTree(node.right); //Copies a tree inside right node

        return returnNode; //Returns the formed Tree
    }
}