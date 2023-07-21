/*  
    *  Given an integer x, return true if x is a palindrome, and false otherwise.

    Example 1:

    Input: x = 121
    Output: true
    Explanation: 121 reads as 121 from left to right and from right to left.
    Example 2:

    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
    
*/


class Solution {
    public boolean isPalindrome(int n) {
        int d = (int)Math.log10(n);
		int found = 0;
		if(n < 0){
				return false;
		}
		while(n>0) {
			if(n/(int)Math.pow(10, d) != n%10) {
			    found = 1;
				break;
			}
			n = n%(int)Math.pow(10, d);
			n = n/10;
			d = d-2;
		}
		if(found == 1) {
			return false;
		}
		else {
			return true;
		}
    }
}

public class Palindrome {
    public static void main(String[] args) {
        
    }
}
