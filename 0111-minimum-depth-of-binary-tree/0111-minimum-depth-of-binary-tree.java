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
    public int minDepth(TreeNode root) {
        if(root ==null){
            return 0;
        }
        int lheight=minDepth(root.left);
        int rheight=minDepth(root.right);
        if(root.left==null){
            return rheight+1;
        }
        if(root.right==null){
            return lheight+1;
        }
        return Math.min(lheight,rheight)+1;
    }
}