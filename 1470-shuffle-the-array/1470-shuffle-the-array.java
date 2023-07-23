class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j = 0;
        int res[] = new int[2 * n];
        for(int i = 0; i < nums.length; i += 2){
            res[i] = nums[j];
            j++;
        }
        for(int i = 1; i < nums.length; i += 2){
            res[i] = nums[j];
            j++;
        }
        return res;
    }
}