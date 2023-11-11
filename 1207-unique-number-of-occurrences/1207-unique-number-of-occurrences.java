class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        for(int key: hm.keySet()){
            set.add(hm.get(key));
        }
        if(hm.size() != set.size()){
            return false;
        }
        return true;
    }
}