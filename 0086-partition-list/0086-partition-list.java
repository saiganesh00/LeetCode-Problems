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
        if(head == null || head.next == null){
            return head;
        }
        ListNode start = null;
        ListNode prev = null;
        ListNode newList;
        for(ListNode temp = head; temp != null; temp = temp.next){
            if(temp.val < x){
                newList = new ListNode(temp.val);
                if(start == null){
                    start = newList;
                }else{
                    prev.next = newList;
                }
                prev = newList;
            }
        }
        for(ListNode temp = head; temp != null; temp = temp.next){
            if(temp.val >= x){
                newList = new ListNode(temp.val);
                if(start == null){
                    start = newList;
                }else{
                    prev.next = newList;
                }
                prev = newList;
            }
        }
        return start;
    }
}