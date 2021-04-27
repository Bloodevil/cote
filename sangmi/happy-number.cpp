/*
 * https://leetcode.com/problems/happy-number/
 */
class Solution {
public:
    bool isHappy(int n) {  
        unordered_set<int> s;
        int sum = n;                
        while (sum != 1) {
            if (s.find(sum) != s.end()) {
                // Once you found the same value occurred again, 
                // you're in the loop.         
                return false;  
            }
            s.insert(sum);            
            n = sum, sum = 0;
            while (0 < n) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }            
        }     
        return true;        
    }
};
