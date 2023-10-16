class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num , 0)+1);
        }
        int luckyNumber = -1;
        for(int key: hm.keySet()){
            if(key == hm.get(key)){
                luckyNumber = Math.max(luckyNumber, key);
            }
        }
        return luckyNumber;
    }
}