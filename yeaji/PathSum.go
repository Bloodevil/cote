/**
 * Definition for a binary tree node.
 * type TreeNode struct {
 *     Val int
 *     Left *TreeNode
 *     Right *TreeNode
 * }
 */
func hasPathSum(root *TreeNode, targetSum int) bool {
    result := false
    if root == nil {
        return false
    } else {
        // this is leaf
        subSum := targetSum - root.Val
        if root.Left == nil && root.Right == nil {
            return subSum == 0
        }
        if root.Left != nil {
            result = result || hasPathSum(root.Left, subSum)
        }
        if root.Right != nil {
            result = result || hasPathSum(root.Right, subSum)
        }
    }
    return result
}
