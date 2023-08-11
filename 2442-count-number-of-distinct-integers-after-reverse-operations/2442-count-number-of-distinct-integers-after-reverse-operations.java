class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();
    }
}