class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int index = 0;
        int res[] =  new int[nums.length];
        for(int num: nums){
            if(num < pivot){
                res[index++] = num;
            }
        }
        for(int num: nums){
            if(num == pivot){
                res[index++] = num;
            }
        }
        for(int num: nums){
            if(num > pivot){
                res[index++] = num;
            }
        }
        return res;
    }
}