/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
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
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        for (int i = 0; i < inorder.size(); ++i) inorderValueToIdxMap[inorder[i]] = i;          
        int rootIdx = postorder.size() - 1;        
        return build(inorder, postorder, rootIdx, 0, rootIdx);
    }
    
private:
    TreeNode* build(vector<int>& inorder, vector<int>& postorder, int &postIdx, int leftIdx, int rightIdx) {
        if (leftIdx > rightIdx) return nullptr;        
        // inorder      [left] -> [root] -> [right]
        // postorder    [left] -> [right] -> [root]        
        // Get items from the back of the postorder which are root nodes
        int rootVal = postorder[postIdx];
        TreeNode* root = new TreeNode(rootVal);        
        
        // Divide inorder array by root node to left and right subtrees
        int pivotIdx = inorderValueToIdxMap[rootVal];        
        --postIdx; // Decrease rootIdx in postorder for recursion 
        root->right = build(inorder, postorder, postIdx, pivotIdx + 1, rightIdx);
        root->left = build(inorder, postorder, postIdx, leftIdx, pivotIdx - 1);                    
        return root;        
    }
    
    unordered_map<int, int> inorderValueToIdxMap;
};
