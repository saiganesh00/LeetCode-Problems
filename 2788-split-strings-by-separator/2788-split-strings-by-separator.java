class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List list= new ArrayList<>();
        for(int i=0;i<words.size();i++){
        String str[]=words.get(i).split("["+separator+"]");
        for(int j=0;j<str.length;j++){
        if(str[j].length()>0) list.add(str[j]);
        }
        }
        return list;
    }
}