class Solution {
    public boolean isValidBST(TreeNode root) {
        Integer temp = null;
        Integer leftVal = null;
        Integer rightVal = null;

        try {
            temp = new Integer(root.val);
            leftVal = new Integer(root.left.val);
            rightVal = new Integer(root.right.val);
        }
        catch(NullPointerException e){}
        if(temp != null){
            if(leftVal != null){
                if(temp <= leftVal) {
                    return false;
                }
                isValidBST(root.left);
            }
            if(rightVal != null){
                if(rightVal <= temp) {
                    return false;
                }
                isValidBST(root.right);
            }
        }

        return true;
    }
}
/*
Input: [1,null,1]
Output: true -> 1 left가 null이므로 temp != null조건에 해당하지 않고 바로 true반환
Expected: false

모르겠어서 정답 확인 했습니다.

class Solution {
    public boolean validate(TreeNode root, Integer low, Integer high) {
        // Empty trees are valid BSTs.
        if (root == null) {
            return true;
        }
        // The current node's value must be between low and high.
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        // The left and right subtree must also be valid.
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}


*/
