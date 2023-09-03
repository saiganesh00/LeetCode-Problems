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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        if(head == null || head.next == null){
            head = null;
            return head;
        }
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        temp = head;
        int num = length - n;
        if(num <= 0){
            head = head.next;
            return head;
        }
        int i = 0;
        while(i < num-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }
}