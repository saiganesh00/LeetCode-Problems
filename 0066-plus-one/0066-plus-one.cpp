class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        bool carry = 0;
        for(int i = digits.size()-1; i >= 0; i--){
            if(digits[i] <= 8) {
                digits[i] += 1;
                carry = 0;
                break;
            }else {
                digits[i] = 0;
                carry = 1;
            }
        }
        if(carry){
            digits.insert(digits.begin(), 1);
        }
        return digits;
    }
};