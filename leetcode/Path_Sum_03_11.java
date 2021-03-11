class Solution {
    public static int sumValue = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {

        /*
        sudo
        if(no children) => add sumValue ...
        then compare sumValue and targetSum
        return compare result

        리프란?
        root.leaf == null && root.right == null
        -> add sumValue
        else nothing?
        */

        if(root.left != null && root.right != null)
        {
            hasPathSum(root.left, targetSum);
            hasPathSum(root.right, targetSum);
        }
        else if(root.left != null && root.right == null)
        {
            hasPathSum(root.left, targetSum);
        }
        else if(root.left == null && root.right != null)
        {
            hasPathSum(root.right, targetSum);
        }
        else if(root.left == null && root.right == null)
        {
            sumValue = sumValue + root.val;
        }

        if(sumValue == targetSum) return true;
        else return false;

    }
}