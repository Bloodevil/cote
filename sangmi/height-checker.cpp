/*
 * https://leetcode.com/problems/height-checker/
 */
class Solution {
public:
    int heightChecker(vector<int>& heights) {
        vector<int> sortedHeights (heights.size());
        partial_sort_copy(begin(heights), end(heights), begin(sortedHeights), end(sortedHeights));     
        int ans = 0;
        for (int i = 0; i < heights.size(); ++i) {
            if (sortedHeights[i] != heights[i]) ++ans;
        }
        return ans;
    }
};
