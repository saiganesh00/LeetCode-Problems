class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            String s = nums[i]+"";
            for(int j=0; j<s.length(); j++){
                temp.add(s.charAt(j)-'0');
            }
        }
        int res[] = new int[temp.size()];
        for(int i=0; i<temp.size(); i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}