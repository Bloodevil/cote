/**
 * https://leetcode.com/problems/validate-binary-search-tree/
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
    bool isValidBST(TreeNode* root) {
        TreeNode* prev = nullptr;
        return validate(root, prev);
    }
    
    bool validate(TreeNode* node, TreeNode* &prev) {
        if (node == nullptr) return true;
        // Traversing in inorder [left->root->right] will visit nodes in ascending order        
        if (!validate(node->left, prev)) return false;
        if (prev != nullptr && node->val <= prev->val) return false;
        prev = node;
        return validate(node->right, prev);
    }
};
