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
        Set<Integer> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null){
            set.add(temp.val);
            temp = temp.next;
        }
        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        ListNode newHead = null;
        int i = 0;
        int size = al.size();
        while(i < size){
            ListNode newNode = new ListNode(al.get(i++));
            if(newHead == null){
                newHead = newNode;
            }else{
                ListNode cur = newHead;
                while(cur.next != null){
                    cur = cur.next;
                }
                cur.next = newNode;
            }
        }
        return newHead;
    }
}