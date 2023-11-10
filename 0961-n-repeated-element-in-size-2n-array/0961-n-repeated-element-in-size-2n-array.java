class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int key: hm.keySet()){
            if(hm.get(key) == n){
                return key;
            }
        }
        return 0;
    }
}