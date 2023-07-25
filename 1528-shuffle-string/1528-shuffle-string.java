class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            ch[indices[i]] = s.charAt(i);
        }
        String res = "";
        for(int i = 0; i < ch.length; i++){
            res += ch[i];
        }
        return res;
    }
}