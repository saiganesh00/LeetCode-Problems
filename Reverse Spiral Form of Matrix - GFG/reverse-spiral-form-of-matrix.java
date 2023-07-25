//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int left = 0, right = C-1, top = 0, down = R-1, dir = 0;
        while(top <= down && left <= right){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    al.add(a[top][i]);
                }
                top += 1;
            }
            if(dir == 1){
                for(int i = top; i <= down; i++){
                    al.add(a[i][right]);
                }
                right -= 1;
            }
            if(dir == 1){
                for(int i = right; i >= left; i--){
                    al.add(a[down][i]);
                }
                down -= 1;
            }
            if(dir == 2){
                for(int i = down; i >= top; i--){
                    al.add(a[i][left]);
                }
                left += 1;
            }
            dir = (dir+1)%4;
        }
        Collections.reverse(al);
        int res[] = new int[al.size()];
        for(int i = 0; i < al.size(); i++){
            res[i] = al.get(i);
        }
        return res;
    }
}