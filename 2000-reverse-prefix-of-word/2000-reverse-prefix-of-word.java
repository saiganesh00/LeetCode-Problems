class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+"")){
            return word;
        }
        int index = word.indexOf(ch);
        String rev = word.substring(0, index+1);
        StringBuilder sb = new StringBuilder(rev);
        sb = sb.reverse();
        
        return sb.toString() + word.substring(index+1, word.length());
    }
}