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
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        int mid=nums.length/2;
        TreeNode root=new TreeNode(nums[mid]);
        int []left=new int[mid];
        int []right=new int[nums.length-mid-1];
        for(int i=0;i<mid;i++){
            left[i]=nums[i];
        }
        for(int i=mid+1;i<nums.length;i++){
            right[i-mid-1]=nums[i];
        }
        root.left=sortedArrayToBST(left);
        root.right=sortedArrayToBST(right);
        return root;
    }
}