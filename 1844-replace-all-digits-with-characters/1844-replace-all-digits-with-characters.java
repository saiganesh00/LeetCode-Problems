class Solution {
    public String replaceDigits(String s) {
        String res="";
        for(int i=0; i<s.length(); i++) {
            if(i % 2 == 0) {
                res += s.charAt(i);
            }
            else {
                char temp;
                temp = (char) ((int) s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
                res += temp;
            }
        }
    return res;
    }
}