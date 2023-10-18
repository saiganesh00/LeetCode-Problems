class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0; i <= s.length()-3; i++){
            String substr = s.substring(i, i+3);
            if(isDistinct(substr)){
                count++;
            }
        }
        return count;
    }
    public boolean isDistinct(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: str.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        for(char key: hm.keySet()){
            if(hm.get(key) > 1){
                return false;
            }
        }
        return true;
    }
}