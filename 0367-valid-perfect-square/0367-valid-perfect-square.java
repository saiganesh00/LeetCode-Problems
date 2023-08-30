class Solution {
    public boolean isPerfectSquare(int num) {
        double ans = Math.sqrt(num);
        return Math.ceil(ans) == Math.floor(ans);
    }
}