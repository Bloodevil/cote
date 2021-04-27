/*
 * https://leetcode.com/problems/masking-personal-information/
 */
class Solution {
public:
    string maskPII(string S) {
        auto atIdx = S.find('@');
        string res;
        if (atIdx != string::npos) {
            // mask email
            res.push_back(tolower(S[0]));
            res.append("*****");
            res.push_back(tolower(S[atIdx - 1]));
            res.push_back('@');
            for (int i = atIdx + 1; i < S.length(); ++i) res.push_back(tolower(S[i]));
        } else {
            // mask phone number
            string digits;
            for (int i = 0; i < S.length(); ++i) {
                if (isdigit(S[i])) digits.push_back(S[i]);
            }
            res.append(getCountryPrefix(digits.length() % 10));            
            res.append(PHONE_NUMBER_PREFIX);
            res.append(digits.substr(digits.size() - 4, 4));
        }        
        return res;
    }
    
private:    
    const char* getCountryPrefix(int len) {
        switch (len) {
            case 1: return COUNTRY_CODE_DIGIT1_PREFIX;
            case 2: return COUNTRY_CODE_DIGIT2_PREFIX;
            case 3: return COUNTRY_CODE_DIGIT3_PREFIX;
            case 0: 
            default: 
                return COUNTRY_CODE_DIGIT0_PREFIX; 
        }        
    }
    
    static constexpr const char* PHONE_NUMBER_PREFIX = "***-***-";
    static constexpr const char* COUNTRY_CODE_DIGIT0_PREFIX = "";
    static constexpr const char* COUNTRY_CODE_DIGIT1_PREFIX = "+*-";
    static constexpr const char* COUNTRY_CODE_DIGIT2_PREFIX = "+**-";
    static constexpr const char* COUNTRY_CODE_DIGIT3_PREFIX = "+***-";
};
