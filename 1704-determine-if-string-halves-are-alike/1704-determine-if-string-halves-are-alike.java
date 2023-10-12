class Solution {
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        String a = s.substring(0, (length/2));
        String b = s.substring((length/2), length);
        int vowelsInA = 0;
        int vowelsInB = 0;
        String vowels = "aeiouAEIOU";
        for(char ch: a.toCharArray()){
            if(vowels.contains(ch+"")){
                vowelsInA++;
            }
        }
        for(char ch: b.toCharArray()){
            if(vowels.contains(ch+"")){
                vowelsInB++;
            }
        }
        return vowelsInA == vowelsInB;
    }
}