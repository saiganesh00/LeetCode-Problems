class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        int pos = -1;
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            String str = haystack.substring(i, i+needle.length());
            if(str.equals(needle)){
                pos = i;
                break;
            }
        }
        return pos;
    }
}