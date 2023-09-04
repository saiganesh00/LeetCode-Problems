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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode current = head;
        boolean duplicate = false;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                duplicate = true;
                current.next = current.next.next;
            }else{
                if(duplicate){
                    current.val = current.next.val;
                    current.next = current.next.next;
                    duplicate = false;
                }else{
                    current = current.next;
                }
            }
        }
        current = head;
        if(duplicate){
            if(current.next == null){
                return null;
            }
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }
        return head;
    }
}