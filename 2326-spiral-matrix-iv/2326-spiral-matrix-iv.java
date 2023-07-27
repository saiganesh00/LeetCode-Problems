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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int arr[][] = new int[m][n];
        for(int[] row: arr){
            Arrays.fill(row, -1);
        }
        int left = 0, right = n - 1, top = 0, down = m -1;
        while(head != null){
            for(int i = left; i <= right && head != null; i++){
                arr[top][i] = head.val;
                head = head.next;
            }
            top += 1;
            for(int i = top; i <= down && head != null; i++){
                arr[i][right] = head.val;
                head = head.next;
            }
            right -= 1;
            for(int i = right; i >= left && head != null; i--){
                arr[down][i] = head.val;
                head = head.next;
            }
            down -= 1;
            for(int i = down; i >= top && head != null; i--){
                arr[i][left] = head.val;
                head = head.next;
            }
            left += 1;
        }
        return arr;
    }
}