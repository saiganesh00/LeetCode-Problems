class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++)   {
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}