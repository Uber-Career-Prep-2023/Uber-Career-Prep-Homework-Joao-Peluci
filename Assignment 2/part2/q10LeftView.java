import implementations.TreeNode;
//18min elapsed
//Time complexity of O(n)
//Space complexity O(n)
//Depth first generic approach
public class q10LeftView {
    //Given a binary tree, create an array of the left view (leftmost elements in each level) of the tree.
    public static void leftView(TreeNode root) {
        //In this problem, we have a binary tree, and we'll always print the leftview of it.
        //So, we can just call recursively the function leftView and print while there is a left node in tree

        if (root.left!=null){
            System.out.println(root.left.val);
            leftView(root.left);
        }
        if (root.right!=null){
            leftView(root.right);
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        leftView(root);     
    }
}
