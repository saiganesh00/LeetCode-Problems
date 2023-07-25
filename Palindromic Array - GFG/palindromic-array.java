//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean isPalindrome(int n){
        int d = (int)Math.log10(n);
        boolean flag = true;
        while(n > 0){
            if(n % 10 != n / (int)Math.pow(10, d)){
                flag = false;
                break;
            }
            n = n % (int)Math.pow(10, d);
            n = n / 10;
            d = d - 2;
        }
        if(flag) {
            return true;
        }
        return false;
    }
    
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  int count = 0;
                  for(int i = 0; i < n; i++){
                      if(isPalindrome(a[i])){
                          count += 1;
                      }
                  }
                  if(count == n){
                      return 1;
                  }
                  return 0;
           }
}