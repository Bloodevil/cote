/*
 * https://leetcode.com/problems/longest-common-prefix/
 */
class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        
        const string& firstStr = strs.front();
        const string& lastStr = strs.back();
        string ans;        
        for (int i = 0; i < firstStr.length(); ++i) {
            if (i == lastStr.length() || firstStr[i] != lastStr[i]) break;
            ans.push_back(firstStr[i]);
        }        
        return ans;        
    }
};
