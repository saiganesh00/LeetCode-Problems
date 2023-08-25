class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxFreq = 0;
        int element = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                int cur = hm.getOrDefault(nums[i], 0)+1;
                hm.put(nums[i], cur);
                if( cur > maxFreq || (cur == maxFreq && nums[i] < element)){
                    maxFreq = cur;
                    element = nums[i];
                }
            }
        }
        return maxFreq == 0 ? -1 : element;
    }
}