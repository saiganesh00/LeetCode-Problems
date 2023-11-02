public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = Integer.bitCount(n);
        return count;
    }
}