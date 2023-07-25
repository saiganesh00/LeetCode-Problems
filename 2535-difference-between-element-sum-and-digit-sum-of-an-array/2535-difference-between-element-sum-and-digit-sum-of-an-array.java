class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int i = 0; i < nums.length; i++){
            eleSum += nums[i];
            int temp = nums[i];
            while(temp > 0){
                digitSum += temp % 10;
                temp = temp / 10;
            }
        }
        return (int)Math.abs(eleSum - digitSum);
    }
}