class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: nums){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int num: hm.keySet()){
            if(hm.get(num) > nums.length/3){
                al.add(num);
            }
        }
        return al;
    }
}