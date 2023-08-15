class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int num: nums){
            if(num > 0){
                positive.add(num);
            }else{
                negative.add(num);
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(i % 2 == 0){
                nums[i] = positive.get(i/2);
            }else{
                nums[i] = negative.get(i/2);
            }
        }
        return nums;
    }
}