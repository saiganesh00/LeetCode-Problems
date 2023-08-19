class Solution {
    public boolean digitCount(String num) {
        HashMap<Integer, Integer> hm  = new HashMap<>();
        for(int i = 0; i < num.length(); i++){
            int ch = num.charAt(i) - '0';
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }
        int count = 0;
        for(int i = 0; i < num.length(); i++){
            if(hm.containsKey(i)){
                count = hm.get(i);
            }else{
                count = 0;
            }
            int x = num.charAt(i) - '0';
            if(count != x){
                return false;
            }
        }
        return true;
    }
}