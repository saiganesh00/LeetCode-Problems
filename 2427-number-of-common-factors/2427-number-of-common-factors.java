class Solution {
    public int commonFactors(int a, int b) {
        int min = a < b ? a : b;
        int i = 1;
        int count = 0;
        while(i <= min){
            if(a % i == 0 && b % i == 0){
                count++;
            }
            i++;
        }
        return count;
    }
}