class Solution {
public:
    void sortColors(vector<int>& nums) {
        int first = 0;
        int last = nums.size()-1;
        int mid = 0;
        while(mid <= last){
            switch(nums[mid]){
                case 0:
                    swap(nums[first++], nums[mid++]);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums[last--], nums[mid]);
                    break;
            }
        }
    }
};