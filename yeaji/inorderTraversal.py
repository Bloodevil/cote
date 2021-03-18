class Solution:
    def inorderTraversal(self, root: TreeNode) -> List[int]:
        s=[]
        def preorder(root):
            if root is None:
                return 
            
            preorder(root.left)
            s.append(root.val)
            preorder(root.right)
        preorder(root)
        
        return s
