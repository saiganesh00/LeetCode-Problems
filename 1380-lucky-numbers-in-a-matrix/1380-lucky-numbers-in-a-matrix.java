class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(checkLuckyNumber(matrix, i, j)){
                    al.add(matrix[i][j]);
                }
            }
        }
        return al;
    }
    public boolean checkLuckyNumber(int[][] matrix, int row, int col){
        int element = matrix[row][col];
        
        for(int i = 0; i < matrix[row].length; i++){
            if(matrix[row][i] < element && i != col){
                return false;
            }
        }
        
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][col] > element && i != row){
                return false;
            }
        }
        return true;
    }
}