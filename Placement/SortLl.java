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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode rightH=slow.next;
        slow.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(rightH);

        return mergeBack(left,right);

        

    }
    private ListNode mergeBack(ListNode left, ListNode right){
        ListNode newN= new ListNode(0);
        ListNode newNC= newN;

        while(left!=null && right!=null){
            if(left.val<right.val){
                newNC.next=left;
                left=left.next;
            }else{
                newNC.next=right;
                right=right.next;
            }
            newNC= newNC.next;
        }
        if(left!=null){
            newNC.next=left;
        }
          if(right!=null){
            newNC.next=right;
        }
        return newN.next;
    }
}