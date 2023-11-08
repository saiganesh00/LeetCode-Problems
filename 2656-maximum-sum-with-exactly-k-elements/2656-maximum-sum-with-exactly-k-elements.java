class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(max<nums[i]) max = nums[i];
        }
        return max*k + (k-1)*k/2;
    }
}