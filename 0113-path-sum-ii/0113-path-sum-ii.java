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
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root,targetSum,new ArrayList<Integer>(),0);
        return ans;
    }
    public void helper(TreeNode root,int targetSum,List<Integer> path,int sum){
        if(root==null){
            return;
        }
        path.add(root.val);
        sum=sum+root.val;
        if(root.left==null && root.right==null){
            if(sum==targetSum){
                ans.add(new ArrayList<>(path));
            }
        }
        helper(root.left,targetSum,path,sum);
        helper(root.right,targetSum,path,sum);
        path.remove(path.size()-1);
    }
}