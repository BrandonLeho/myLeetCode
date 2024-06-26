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
    private List<TreeNode> sortedArr = new List<TreeNode>();

    public TreeNode BalanceBST(TreeNode root) {
        InorderTraverse(root);
        return SortedArrayToBST(0, sortedArr.Count - 1);
    }

    private void InorderTraverse(TreeNode root) {
        if (root == null) return;
        InorderTraverse(root.left);
        sortedArr.Add(root);
        InorderTraverse(root.right);
    }

    private TreeNode SortedArrayToBST(int start, int end) {
        if (start > end) return null;
        int mid = (start + end) / 2;
        TreeNode root = sortedArr[mid];
        root.left = SortedArrayToBST(start, mid - 1);
        root.right = SortedArrayToBST(mid + 1, end);
        return root;
    }
}