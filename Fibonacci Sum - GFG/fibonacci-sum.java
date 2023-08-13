//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long n){
        //code here
        int val = 1000000007;
        long[] arr = new long[(int)(n+1)];
        arr[0] = 0;
        arr[1] = 1;
        long sum = arr[0] + arr[1];
        for(int i = 2; i <= n; i++){
            arr[i] = arr[i-1] % val + arr[i-2] % val;
            sum += arr[i];
        }
        return sum % val;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends