class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                prod *= -1;
            }else if(nums[i] > 0){
                prod *= 1;
            }else{
                prod *= 0;
            }
        }
        return prod;
    }
}