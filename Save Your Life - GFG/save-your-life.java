//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends
class Solution{
    static String maxSum(String w,char x[],int b[], int n){
        //code here
        int sum = 0;
        int maxSum = 0;
        String res = "";
        String r = "";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            hm.put(x[i], b[i]);
        }
        for(int i = 0; i < w.length(); i++){
            char ch = w.charAt(i);
            if(hm.containsKey(ch)){
                sum += hm.get(ch);
                res += ch;
            }else{
                sum += (int)ch;
                res += ch;
            }
            if(sum < 0){
                sum = 0;
                res = "";
            }
            maxSum = Math.max(maxSum, sum);
            if(maxSum == sum){
                r = res;
            }
        }
        if(w.length() == 1 && maxSum == 0){
            return w;
        }
        return r;
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
            String w = read.readLine();
            int n = Integer.parseInt(read.readLine());
            String TE[] = read.readLine().trim().split(" ");
            char x[] = new char[n];
            for(int i = 0;i<n;i++)
            {
                x[i] = TE[i].charAt(0);
            }
            
            String TR[] = read.readLine().trim().split(" ");
            int b[] = new int[n];
            for(int i = 0;i<n;i++)
            {
                b[i] = Integer.parseInt(TR[i]);
            }
           
            Solution ob = new Solution();
            System.out.println(ob.maxSum(w,x,b,n));
        }
    }
}
// } Driver Code Ends