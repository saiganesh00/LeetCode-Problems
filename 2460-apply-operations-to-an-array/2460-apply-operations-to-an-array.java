class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(i < n-1){
                if(nums[i] == nums[i+1]){
                    nums[i] *= 2;
                    nums[i+1] = 0;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                count++;
            }else{
                al.add(nums[i]);
            }
        }
        while(count-- > 0){
            al.add(0);
        }
        for(int i = 0; i < al.size(); i++){
            nums[i] = al.get(i);
        }
        return nums;
    }
}