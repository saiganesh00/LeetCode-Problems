class MyHashMap {
    
    HashMap<Integer, Integer> hm;

    public MyHashMap() {
        hm = new HashMap<>();
    }
    
    public void put(int key, int value) {
        hm.put(key, value);
    }
    
    public int get(int key) {
        int found = -1;
        for(Map.Entry e: hm.entrySet()){
            if((int)e.getKey() == key){
                found = (int)e.getValue();
            }
        }
        return found;
    }
    
    public void remove(int key) {
        hm.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */