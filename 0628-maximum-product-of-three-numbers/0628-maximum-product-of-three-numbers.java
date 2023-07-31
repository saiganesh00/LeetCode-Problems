class Solution {
    public int maximumProduct(int[] nums) {
        int[] max = {-1001, -1001, -1001};
        int[] min = {1001, 1001};
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max[0]){
                int first = max[0];
                int second = max[1];
                max[0] = nums[i];
                max[1] = first;
                max[2] = second;
            }else if(nums[i] >= max[1]){
                int first = max[1];
                max[1] = nums[i];
                max[2] = first;
            }else if(nums[i] >= max[2]){
                max[2] = nums[i];
            }
            if(nums[i] <= min[0]){
                int first = min[0];
                min[0] = nums[i];
                min[1] = first;
            }else if(nums[i] <= min[1]){
                min[1] = nums[i];
            }
        }
        return Math.max(max[0]*max[1]*max[2], max[0]*min[0]*min[1]);
    }
}