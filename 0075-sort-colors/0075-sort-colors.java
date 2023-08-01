class Solution {
    public void sortColors(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int current = 0;
        int temp;
        while(current <= last){
            switch(nums[current]){
                case 0:
                    temp = nums[first];
                    nums[first++] = nums[current];
                    nums[current++] = temp;
                    break;
                case 1:
                    current++;
                    break;
                case 2:
                    temp = nums[last];
                    nums[last--] = nums[current];
                    nums[current] = temp;
            }
        }
    }
}