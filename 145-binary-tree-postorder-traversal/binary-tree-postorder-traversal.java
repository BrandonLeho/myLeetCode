/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        postorderRecursive(root, output);
        return output;
    }

    public void postorderRecursive(TreeNode root, List<Integer> list){
        if (root != null){
            postorderRecursive(root.left, list);
            postorderRecursive(root.right, list);
            list.add(root.val);
        }
    }
}