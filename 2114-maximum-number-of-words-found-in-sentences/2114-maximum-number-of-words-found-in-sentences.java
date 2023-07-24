class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(String str: sentences){
            String[] words = str.split(" ");
            int countWords = words.length;
            if(maxWords < countWords){
                maxWords = countWords;
            }
        }
        return maxWords;
    }
}