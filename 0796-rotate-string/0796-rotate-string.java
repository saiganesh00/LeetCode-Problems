class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        while(n-- > 0){
            if(sb.toString().equals(goal)){
                return true;
            }
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
        }
        return false;
    }
}