//{ Driver Code Starts
//Initial Template for Java
import java.util.*;

class GFG 
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    obj.SortedDuplicates(arr, n);
		    System.out.println();  // print the newline
		    
		}
	}
}




// } Driver Code Ends
//User function Template for Java

/* Helper class containing function SortedDuplicates
containg arguments
arr[]: the duplicated array
n: size of the array
*/
class Geeks
{
    // print the elements which appear more than
    // once in the array in sorted order
    public static void SortedDuplicates(int arr[], int n)
    {
        //Your code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num: arr){
            hm.put(num, hm.getOrDefault(num, 0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            if(hm.get(num) > 1){
                set.add(num);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        if(al.isEmpty()){
            System.out.print(-1);
        }
        for(int num: al){
            System.out.print(num + " ");
        }
     }
    
}
   

//{ Driver Code Starts.

// } Driver Code Ends