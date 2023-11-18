class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int count =0;
        // int count1 =0;
        int a = nums[0];
        int b = nums[nums.length-1];
        for(int i=0;i<nums.length;i++){
            if(a==nums[i]){
                count++;
            }
            else if(b == nums[i]){
                count++;
            }
        }
        return nums.length-(count);
    }
}