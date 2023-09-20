//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.padovanSequence(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
  public int padovanSequence(int n)
    {
        //code here.
         int dp[] = new int[n+2];
        dp[0] = 1;
        dp[1] =1;
        dp[2] = 1;
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-2]+dp[i-3])%1000000007; 
        }
        return dp[n]%1000000007;
    }
    
}
