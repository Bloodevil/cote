class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root == None:
            return 0
        result = 1
        if root.right == None and root.left == None:
            return result
        
        result += max(self.maxDepth(root.right), self.maxDepth(root.left))
        return result
        
