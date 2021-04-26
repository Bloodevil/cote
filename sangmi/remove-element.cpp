/*
 * https://leetcode.com/problems/remove-element/
 */
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        nums.erase(std::remove_if(nums.begin(), nums.end(), [val](int i) { return val == i; }), 
                   end(nums));
        return nums.size();
    }
};
