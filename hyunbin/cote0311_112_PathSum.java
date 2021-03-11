/*
Given the root of a binary tree and an integer targetSum,
return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
A leaf is a node with no children.
*/

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
 
public class cote0311_112_PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int sum=0;
        makeSum(root, sum, targetSum);
        if(sum == targetSum) return true;
        else return false;
    }
    //문제 1. 거꾸로 더한 값을 하나씩 다 체크하고 있음. 리프면 재귀함수 자체가 끝나야 하는데..
   public void makeSum(TreeNode root, int sum, int targetSum){
        sum+=root.val;
        if(sum == targetSum){
            return;
        }
        if(root.left != null){
                makeSum(root.left, sum, targetSum);
            } //왼쪽 노드 쭉쭉 순회
        
            if(root.right != null){    
                makeSum(root.right, sum, targetSum);
            }
            //왼쪽 오른쪽 둘 다 없으면 sum 리턴
        System.out.println(sum);
    }

    public void makeSum2(TreeNode root, int sum, int targetSum){
       /*
        sum을 계속 더해주기만 하니까 leaf node일 때 끝내지 못하는 거 같음.
        어떻게 하면 leaf일때 함수를 종료시킬 수 있을까 생각해봤는데 답을 못찾았어요

        sum = sum + root.val;
        if sum == targetSum then return;
        if root.left is not null then makeSum(root.left, sum, targetSum);
        if root.right is not null then makeSum(root.right, sum, targetSum);
       */ 
        sum+=root.val;
        if(sum == targetSum){
            return;
        }
        if(root.left != null){
                makeSum(root.left, sum, targetSum);
            } //왼쪽 노드 쭉쭉 순회
        
            if(root.right != null){    
                makeSum(root.right, sum, targetSum);
            }
            //왼쪽 오른쪽 둘 다 없으면 sum 리턴
        System.out.println(sum);
    }
}

//Discussion에 있는 풀이를 보고 주석을 추가해봤습니다.
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){ //루트가 비어있으면 false 리턴
            return false;
        } 
    
        //leaf면 sum과 root.val을 비교한 결과값을 리턴
        //sum과 root.val을 비교하는 이유는 아래에서 sum-root.val값을 sum값으로 넣어줬기 때문이다. 
        if(root.left == null && root.right == null){
            return sum == root.val;
        } 
    
        //그 외의 경우, 리프노드가 아니고 루트가 비어있지도 않은 경우, 즉 추가로 탐색할 것이 남아있는 경우 재귀함수 실행
        //재귀함수 실행 시 현재 루트의 밸류값만큼 뺀 sum을 비교한다. 이렇게 하면 leaf에 도달했을 경우 결국 sum값이 leaf.val과 동일해짐
        //둘 중 하나라도 true결과가 나오면 되니까 or 연산자 사용
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);

    }
}