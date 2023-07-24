class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums[i]; j++){
                al.add(nums[i+1]);
            }
            i++;
        }
        int res[] = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            res[i] = al.get(i);
        }
        return res;
    }
}