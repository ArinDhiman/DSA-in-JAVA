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
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        ListNode a=left;
        ListNode b=right;
        while(head!=null){
            if(head.val<x){
                a.next=head;
                a=a.next;
            }else{
                b.next=head;
                b=b.next;
            }
            head=head.next;
        }
        b.next=null;
        a.next=right.next;

        return left.next;
    }
}