class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }
        int found = 0;
        for(int i = 0; i < nums.length; i++){
            if(hm.get(nums[i]) == 1){
                found = nums[i];
            }
        }
        return found;
    }
}