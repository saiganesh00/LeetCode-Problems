//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            Long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isValid(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static String isValid(Long N){
        // code here
        String res = N%5 == 0? "YES" : "NO";
        return res;
        
    }
}