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
    public void reverse(int[] arr, int si, int ei){
        int temp;
        while(si < ei){
            temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            n++;
        }
        int[] arr = new int[n];
        int i = 0;
        temp = head;
        while(temp != null){
            arr[i++] = temp.val;
            temp = temp.next;
        }
        if(k == 0 || arr.length == k || arr.length == 1){
            return head;
        }
        k = k % n;
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, 0, arr.length-1);
        ListNode newHead = null;
        i = 0;
        while(i < arr.length){
            ListNode newNode = new ListNode(arr[i++]);
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