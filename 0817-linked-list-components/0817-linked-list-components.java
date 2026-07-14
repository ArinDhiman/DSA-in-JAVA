/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] nums) {
        int count=0;
        while(head!=null){
            boolean current=false;
            boolean next=false;

            for(int i=0;i<nums.length;i++){
                if(nums[i]==head.val){
                    current=true;
                    break;
                }
            }
            if(head.next!=null){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==head.next.val){
                    next=true;
                    break;
                }
            }
        }
        if(current && !next){
            count++;
        }
         head=head.next;
        }
       return count;
    }
}