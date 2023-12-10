class Solution {
    public int getMaximumGenerated(int n) {
        int nums[]=new int[n+1];
        if(n==0)return 0;
        if(n==1)return 1;
        nums[0]=0;
        nums[1]=1;
        int max=0;
        for(int i=2;i<n+1;i++){
            if(i%2==0){
                nums[i]=nums[i/2];
            }
            else{
                nums[i]=nums[i/2+1]+nums[i/2];
            }
            max=Math.max(nums[i],max);
        }
        // System.out.print(Arrays.toString(nums));
        return max;
    }
}