class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String operation: operations){
            if(operation.equals("X++")){
                x = x + 1;
            }else if(operation.equals("++X")){
                x = x + 1;
            }else if(operation.equals("X--")){
                x = x - 1;
            }else if(operation.equals("--X")){
                x =  x - 1;
            }
        }
        return x;
    }
}