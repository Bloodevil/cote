class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        result = []
        level = 0
        if root == None:
            return []
        same_level_list = [root]
        next_list = []
        while same_level_list:
            node = same_level_list.pop(0)
            if len(result) < level + 1:
                result.append([])
            result[level].append(node.val)
            if node.left:
                next_list.append(node.left)
            if node.right:
                next_list.append(node.right)
            if len(same_level_list) == 0:
                same_level_list = next_list
                next_list = []
                level += 1
        return result
