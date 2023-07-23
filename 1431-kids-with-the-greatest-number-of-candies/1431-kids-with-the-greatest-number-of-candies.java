import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> al = new ArrayList<>();
        int copyArr[] = candies.clone();
        Arrays.sort(copyArr);
        int greatest = copyArr[candies.length-1];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatest){
                al.add(true);
            }else{
                al.add(false);
            }
        }
        return al;
    }
}