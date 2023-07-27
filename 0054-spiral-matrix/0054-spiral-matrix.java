class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, right = cols - 1, top = 0, down = rows - 1, dir = 0; 
        while(left <= right && top <= down){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    al.add(matrix[top][i]);
                }
                top += 1;
            }
            if(dir == 1){
                for(int i = top; i <= down; i++){
                    al.add(matrix[i][right]);
                }
                right -= 1;
            }
            if(dir == 2){
                for(int i = right; i >= left; i--){
                    al.add(matrix[down][i]);
                }
                down -= 1;
            }
            if(dir == 3){
                for(int i = down; i >= top; i--){
                    al.add(matrix[i][left]);
                }
                left += 1;
            }
            dir = (dir + 1) % 4;
        }
        return al;
    }
}