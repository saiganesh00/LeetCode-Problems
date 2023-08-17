class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(countDigits(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int countDigits(int num){
        return (int)Math.log10(num)+1;
    }
}