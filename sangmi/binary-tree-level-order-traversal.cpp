/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 *
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {
        vector<vector<int>> ans;
        dfs(ans, root, 0);
        return ans;   
    }
    
    void dfs(vector<vector<int>>& ans, TreeNode* root, int depth) {
        if (root == nullptr) return; 
        if (ans.size() < depth + 1) ans.emplace_back();
        ans[depth].push_back(root->val);        
        dfs(ans, root->left, depth + 1);
        dfs(ans, root->right, depth + 1);        
    }
};
