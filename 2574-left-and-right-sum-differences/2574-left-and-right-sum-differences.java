class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n]    ;
        int[] suff = new int[n];
        pref[0] = 0;
        suff[n-1] = 0;
        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + nums[i-1];
        }
        for(int i = n-2; i >=0; i--){
            suff[i] = suff[i+1]+nums[i+1];
        }
        int ans[] = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = Math.abs(pref[i] - suff[i]);
        }
        return ans;
    }
}