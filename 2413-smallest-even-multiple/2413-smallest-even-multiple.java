class Solution {
    public int smallestEvenMultiple(int n) {
        int res = n;
        while(true){
            if(res % 2 == 0 && res % n == 0){
                break;
            }
            res += n;
        }
        return res; 
    }
}