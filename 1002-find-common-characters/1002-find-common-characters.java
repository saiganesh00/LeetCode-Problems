class Solution {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        for (char ch='a'; ch<='z'; ch++) {
            int minFreq = 101;
            for (String word: words) {
                int count = 0;
                for (int i=0 ;i< word.length(); i++) {
                    if (word.charAt(i) == ch)
                        count++;
                }
                minFreq = Math.min(minFreq, count);
            }
            
            while (minFreq-- > 0) {
                result.add("" + ch);
            }
        }
        return result;
    }
}