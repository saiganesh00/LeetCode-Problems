class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        long rev = 0;
        while(temp > 0){
            int rem = temp % 10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }
        
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            return (int)(-1 * rev);
        }
        return (int)rev;
    }
}