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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while(temp1 != null){
            al.add(temp1.val);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            al.add(temp2.val);
            temp2 = temp2.next;
        }
        Collections.sort(al);
        int i = 0;
        int n = al.size();
        ListNode head = null;
        while(i < n){
            ListNode newNode = new ListNode(al.get(i++));
            if(head == null){
                head = newNode;
            }else{
                ListNode temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        return head;
    }
}