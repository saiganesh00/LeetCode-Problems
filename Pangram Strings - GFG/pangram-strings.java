//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPanagram(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPanagram(String S) {
        // code here
        S = S.toLowerCase();
        int n = S.length();
        if(n < 26){
            return 0;
        }else{
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(S.indexOf(ch) < 0){
                    return 0;
                }
            }
        }
        return 1;
    }
};