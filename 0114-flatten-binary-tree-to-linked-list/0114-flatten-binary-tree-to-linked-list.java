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
    private TreeNode p = null;

    public void flatten(TreeNode r) {
        if (r == null) return;
        flatten(r.right);
        flatten(r.left);
        r.right = p;
        r.left = null;
        p = r;
    }
}