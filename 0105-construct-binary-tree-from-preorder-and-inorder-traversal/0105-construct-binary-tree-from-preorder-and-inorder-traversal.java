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
        int p = 0;
            int i = 0;

                public TreeNode buildTree(int[] pre, int[] in) {
                        return build(pre, in, Integer.MIN_VALUE);
                            }

                                private TreeNode build(int[] pre, int[] in, int stop) {
                                        if (p >= pre.length || in[i] == stop) {
                                                    return null;
                                                            }

                                                                    TreeNode root = new TreeNode(pre[p++]);
                                                                            root.left = build(pre, in, root.val);
                                                                                    i++;
                                                                                            root.right = build(pre, in, stop);

                                                                                                    return root;
                                                                                                        }
                                                                                                        }
