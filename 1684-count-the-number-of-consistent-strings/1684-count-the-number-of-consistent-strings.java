class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set=new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(String str: words){
            boolean flag =true;
            for(char ch: str.toCharArray()){
                if(!set.contains(ch)){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}