/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    int output = 0;
    public TreeNode BstToGst(TreeNode root) {
        if(root != null){
            BstToGst(root.right);
            output += root.val;
            root.val = output;
            BstToGst(root.left);
        }
        return root;
    }
}