class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        for(int i = 0; i < stones.length(); i++){
            char ch = stones.charAt(i);
            if(jewels.contains(ch+"")){
                res += 1;
            }
        }
        return res;
    }
}