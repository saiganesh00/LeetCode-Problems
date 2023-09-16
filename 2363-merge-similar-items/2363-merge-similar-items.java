class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int m = items1.length;
        int n = items2.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i = 0;i<m;i++){

            map.put(items1[i][0],items1[i][1]);

        }


        for(int i = 0;i<n;i++){

            if( map.containsKey(items2[i][0]) ){

                int value = map.get(items2[i][0]);
                value = value + items2[i][1];
                map.put(items2[i][0],value);

            }else{

                map.put(items2[i][0],items2[i][1]);

            }

        }

        List<List<Integer>> ret = new ArrayList<>();


        for(int value: map.keySet()){

            List<Integer> list = new ArrayList<>();
            list.add(value);
            list.add(map.get(value));
            ret.add(list);

        }

        return ret;

    }
}