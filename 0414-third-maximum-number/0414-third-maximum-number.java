class Solution {
    public int thirdMax(int[] nums) {
        int max[] = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int n = nums.length;
        int first, second;
        int count  = 0;
        boolean flag = true;
        for(int i = 0; i < n; i++){
            if(nums[i] == max[0] || nums[i] == max[1] || nums[i] == max[2]){
                if(nums[i] == Integer.MIN_VALUE && flag){
                    count++;
                    flag = false;
                }
                continue;
            }
            if(nums[i] > max[0]){
                first = max[0];
                second = max[1];
                max[0] = nums[i];
                max[1] = first;
                max[2] = second;
                count++;
            }else if(nums[i] > max[1]){
                first = max[1];
                max[1] = nums[i];
                max[2] = first;
                count++;
            }else if(nums[i] > max[2]){
                max[2] = nums[i];
                count++;
            }
        }
        if(count <= 2){
            return max[0];
        }
        return max[2];
    }
}