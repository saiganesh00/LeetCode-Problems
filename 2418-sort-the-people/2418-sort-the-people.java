class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] ans = new String[names.length];
        HashMap<Integer, String> hm = new HashMap<>();
        for(int i = 0; i < heights.length; i++){
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i = heights.length-1, j = 0; i >= 0; i--, j++){
            ans[j] = hm.get(heights[i]);
        }
        return ans;
    }
}