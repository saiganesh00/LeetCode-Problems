class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1 = nums1.length;
    int n2 = nums2.length;
    int n3 = nums3.length;
    
    HashSet<Integer> ans  = new HashSet<>();
    HashSet<Integer> set1 = new HashSet<>();
    HashSet<Integer> set2 = new HashSet<>();
    HashSet<Integer> set3 = new HashSet<>();
    
    for(int x: nums1){
        set1.add(x);
    }
    for(int x: nums2){
        set2.add(x);
    }
    for(int x: nums3){
        set3.add(x);
    }
    // find distinct elements and store in seprate sets.
    //compare  set1 with set2 and set3, if anything common then add it in ans hashset.
    for(int p:set1){
        if(set2.contains(p)){
            ans.add(p);
        }
        else if(set3.contains(p)){
            ans.add(p);
        }
    }
	// check commons in set2 and set3 if so then add them to ans hashset
    for(int p:set2){
        if(set3.contains(p)){
            ans.add(p);
        }
    }
	// convert hashset to arraylist and return. 
    List<Integer> al = new ArrayList<>();
    for(int p: ans){
        al.add(p);
    }
    return al;
    }
}