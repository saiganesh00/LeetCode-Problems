class Solution {
    public boolean checkIfPangram(String sentence) {
        sentence = sentence.toLowerCase();
        int n = sentence.length();
        if(n < 26) {
            return false;
        }else {
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(sentence.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }
}