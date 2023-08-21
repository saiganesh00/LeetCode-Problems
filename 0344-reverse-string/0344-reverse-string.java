class Solution {
    public void reverseString(char[] s) {
        char[] res = new char[s.length];
        int n = s.length;
        for(int i = 0; i < n; i++){
            res[i] = s[n-i-1];
        }
        for(int i = 0; i < s.length; i++){
            s[i] = res[i];
        }
    }
}