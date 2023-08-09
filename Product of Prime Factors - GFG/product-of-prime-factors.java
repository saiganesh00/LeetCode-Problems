//{ Driver Code Starts
//Initial Template for Java

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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long primeProduct(int N) 
    { 
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 2; i <= N; i++){
            if(isPrime(i) && N % i == 0){
                al.add(i);
            }
        }
        long prod = 1;
        for(int i: al){
            prod *= i;
        }
        return prod;
    }
    static boolean isPrime(int num){
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}