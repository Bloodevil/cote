class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode left, TreeNode right) {
        if(left == null && right == null) return true;
        if(left != null && right != null) {
            if (left.val != right.val) return false;
        }else return false; // 둘 중 하나가 null인 경우
        return isSame(left.right, right.left) && isSame(left.left, right.right);
    }
}
/*

root 기준 left와 right가 같을 경우 true

left right 양쪽이 null이면 true
left 혹은 right 한쪽이 null이면 false

left left와 right의 right가 같아야 하고
left의 right와 right의 left가 같아야 함

Runtime: 0 ms
Memory Usage: 37.4 MB
*/
