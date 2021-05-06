package heejeong;

import java.util.*;

public class SortedArrayToBST0430 {
    public TreeNode sortedArrayToBST(int[] nums) {
        // 문제를 이해를 못하고 있음
        if (nums.length == 1){
            return new TreeNode(nums[0]);
        }
        int mid = nums.length / 2;
        TreeNode node = new TreeNode(nums[mid]);    //중간 값 넣기
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty() && mid > 0 && mid < nums.length){
            TreeNode root = queue.poll();
            root.left = new TreeNode(nums[mid--]);
            root.right = new TreeNode(nums[mid++]);
            queue.offer(root.left);
            queue.offer(root.right);
        }
        return node;
    }

    /*
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    */
}
