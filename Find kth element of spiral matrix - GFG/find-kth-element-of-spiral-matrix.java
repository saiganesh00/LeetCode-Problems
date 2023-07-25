//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here	
	    ArrayList<Integer> al = new ArrayList<>();
	    int left = 0, right = m - 1, top = 0, down = n - 1, dir = 0;
	    while(left <= right && top <= down){
	        if(dir == 0){
	            for(int i = left; i <= right; i++){
	                al.add(A[top][i]);
	            }
	            top += 1;
	        }
	        if(dir == 1){
	            for(int i = top; i <= down; i++){
	                al.add(A[i][right]);
	            }
	            right -= 1;
	        }
	        if(dir == 2){
	            for(int i = right; i >= left; i--){
	                al.add(A[down][i]);
	            }
	            down -= 1;
	        }
	        if(dir == 3){
	            for(int i = down; i >= top; i--){
	                al.add(A[i][left]);
	            }
	            left += 1;
	        }
	        dir = (dir+1)%4;
	    }
	    return al.get(k-1);
    }
}