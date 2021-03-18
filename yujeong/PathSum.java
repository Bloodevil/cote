public class PathSum {
    public class TreeNode {
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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        //재귀함수를 활용해 트리를 돌며 targetSum에서 현재 노드값을 빼고, leaf노드에 도달했을 때 0이 되는지?
        
        if(root == null){
            return false;
        }

        if(root.left == null){ //left가 null일 경우
            //현재 node가 leaf인지 판별
            //rignt == null이 참이면 0(=true)을 return, 거짓이면 재귀호출 (right와 targetSum - 현재 노드값)
            return (root.right == null) ? (targetSum - root.val == 0) : hasPathSum(root.right, targetSum - root.val);
        }else{ 
            //rignt == null이 참이면 재귀호출 (left, targetSum - 현재 노드값)
            //거짓일 경우 재귀호출 (현재 node, targetSum)
            return (root.right == null) ? hasPathSum(root.left, targetSum - root.val) : hasPathSum(root, targetSum);
        }
    }
}
