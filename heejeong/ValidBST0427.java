package heejeong;

import java.util.*;

public class ValidBST0427 {
    /*
    // 첫번 째 시도 : 문제해석을 잘못함 (FAIL)
    // 개별 노드의 자식노드만 조건에 만족하고, 루트노드 기준으로 만족 못 함
    public boolean isValidBST_1(TreeNode root) {
        if (root.left != null || root.right != null){
            if (root.left != null && root.left.val >= root.val) {
                return false;
            }
            if (root.right != null && root.right.val <= root.val){
                return false;
            }
            if (root.left != null && root.right != null){
                return isValidBST_1(root.left) && isValidBST_1(root.right);
            }
        }
        return true;
    }
    */

    // 두 번째 시도 (SUCCESS)
    // 전체 트리가 정렬된 이진트리 인지 true or false
    // 1. stack 저장
    Stack<Integer> stack = new Stack<>();
    public void align(TreeNode root) {
        if (root != null){
            align(root.left);
            stack.push(root.val);
            align(root.right);
        }
    }

    // 2. 오름차순 정렬되었는지 확인
    public boolean isValidBST(TreeNode root) {
        align(root);
        while (!stack.isEmpty() && stack.size() > 1){
            int top = stack.pop();
            if (top <= stack.peek()){
                return false;
            }
        }
        return true;
    }

    /*
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    */
}
