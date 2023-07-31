class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int previousSum = 0;
        int currentSum;
        for(int i = 0; i < nums.length; i++){
            currentSum = previousSum + nums[i];
            res = Math.max(res, currentSum);
            previousSum = Math.max(0, currentSum);
        }
        return res;
    }
}