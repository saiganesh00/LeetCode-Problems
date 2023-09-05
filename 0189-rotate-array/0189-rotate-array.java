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
    
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || nums.length == k || k == 0){
            return;
        }
        k = k % nums.length;
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, 0, nums.length-1);
    }
}