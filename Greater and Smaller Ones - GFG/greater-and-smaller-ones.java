//{ Driver Code Starts
//Initial Template for Java

import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Geeks
{
    // Function to find elements greater than or equal to K
    public static void greaterKSorted(int arr[], int k)
    {
        // Your code here
        int flag = 0;
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= k){
                flag = 1;
                set.add(arr[i]);
            }
        }
        if(flag == 0){
            System.out.print(-1);
        }else{
            for(int num: set){
                System.out.print(num + " ");
            }
        }
    }
    
    // Function to find element less than K
    public static void smallerKSorted(int arr[], int k)
    {
        // Your code here
        int flag = 0;
        Set<Integer> set = new TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k){
                flag = 1;
                set.add(arr[i]);
            }
        }
        if(flag == 0){
            System.out.print(-1);
        }else{
            for(int num: set){
                System.out.print(num + " ");
            }
        }
    }
}

//{ Driver Code Starts.

// Driver class
class GFG 
{
    // Driver code
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// Iterating over testcases
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		      arr[i] = sc.nextInt();
		      
		    Geeks obj = new Geeks();
		    obj.greaterKSorted(arr, k);
		    System.out.println();
		    obj.smallerKSorted(arr, k);
		    System.out.println();
		    //System.out.println("~");
		}
	}
}
// } Driver Code Ends