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
    public ListNode middleNode(ListNode head) {
        int count  = 0;
        ListNode temp = head;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
        temp = head;
        count = (count/2);
        while(count-- > 0){
            temp = temp.next;
        }
        return temp;
    }
}