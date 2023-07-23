class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i = 0;
        int count = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[i] == nums[j]){
                count++;
            }
            if(j == nums.length-1){
                i++;
                j = i;
            }
        }
        return count-1;
    }
}