class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int key: hm.keySet()){
            if(hm.get(key) > 1){
                return true;
            }
        }
        return false;
    }
}