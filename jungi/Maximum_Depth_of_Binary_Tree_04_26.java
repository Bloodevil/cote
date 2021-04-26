/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 root가 null인 경우 depth를 반환
 아니면 left 혹은 right를 넣어서 순회
 left와 right의 최대 깊이를 구함
 둘 중에 큰 수를 반환
 Runtime: 0 ms
 Memory Usage: 39.1 MB
 */

class Solution {
    public int maxDepth(TreeNode root) {
        return getMaxDepth(root, 0);
    }

    public int getMaxDepth(TreeNode root, int depth) {
        if(root == null) return depth;
        depth++;

        int leftMax = getMaxDepth(root.left, depth);
        int rightMax = getMaxDepth(root.right, depth);
        return Math.max(leftMax, rightMax);
    }
}

