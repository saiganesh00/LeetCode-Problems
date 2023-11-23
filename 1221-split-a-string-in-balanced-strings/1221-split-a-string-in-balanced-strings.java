class Solution {
    public int balancedStringSplit(String s) {
        int pointer = 1;
        int count = 0;
        
        if(s.charAt(0) == 'R') {
            pointer = -1;
        }
        
        for(int i = 1;i < s.length();i++) {
            if(s.charAt(i) == 'L') {
                pointer++;
            } else {
                pointer--;
            }
            if(pointer == 0) {
                count++;
            }
        }
        
        return count;
    }
}