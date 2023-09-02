class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            char original = pattern.charAt(i);
            String replacement = arr[i];
            if(!hm.containsKey(original)){
                if(!hm.containsValue(replacement)){
                    hm.put(original, replacement);
                }else{
                    return false;
                }
            }else{
                String mappedString = hm.get(original);
                if(!replacement.equals(mappedString)){
                    return false;
                }
            }
        }
        return true;
    }
}