import java.math.BigInteger;
class Solution {
    public String addBinary(String a1, String b1) {
        BigInteger c = new BigInteger(a1,2);
        BigInteger d = new BigInteger(b1,2);
        BigInteger p = c.add(d);        
         String o = p.toString(2);
        return o;
    }
}