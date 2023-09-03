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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        if(count == 2){
            head.next = null;
            return head;
        }
        if(count == 1){
            head = null;
            return head;
        }
        temp = head;
        int mid = count/2;
        int i = 1;
        while(i < mid){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}