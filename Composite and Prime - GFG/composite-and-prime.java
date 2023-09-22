//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().split(" ");
            int L = Integer.parseInt(S[0]);
            int R = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            int ans = ob.Count(L, R);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int Count(int L, int R)
    {
        // code here
        ArrayList<Integer> comp = new ArrayList<>();

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = L; i <= R; i++) {

            if (i <= 1)

                continue;

            if (prime(i))

                primes.add(i);

            else

                comp.add(i);

        }

        return comp.size() - primes.size();
        
    }
    static boolean prime(int num) {

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {

            if (num % i == 0) {

                return false;

            }

        }

        return true;

    }
}