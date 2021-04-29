package heejeong;

public class isSymmetric0428 {
    // 첫번 째 시도 : 레벨이 다른 노드가 같은 val을 가질 경우, false 리턴이 불가함
    /*
    ArrayList<Integer> list = new ArrayList<>();
    public void align(TreeNode root){
        if (root != null){
            align(root.left);
            list.add(root.val);
            align(root.right);
        }
    }
    public boolean isSymmetric(TreeNode root) {
        align(root);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(list.size()-i-1) != list.get(i)){
                return false;
            }
        }
        return true;
    }
    */

    // 정답 열람
    public boolean isSymmetric(TreeNode root) {
        return root == null || check(root.left, root.right);
    }

    public boolean check(TreeNode left, TreeNode right){
        if (left == null && right == null){
            return true;
        }else if (left != null && right != null){
            return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
        }
        return false;
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
