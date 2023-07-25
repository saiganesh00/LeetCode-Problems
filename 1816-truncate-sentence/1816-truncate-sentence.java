class Solution {
    public String truncateSentence(String s, int k) {
        String str = "";
        String sArr[] = s.split(" ");
        for(int i = 0; i < k-1; i++){
            str = str + sArr[i] + " ";
        }
        return str+sArr[k-1];
    }
}