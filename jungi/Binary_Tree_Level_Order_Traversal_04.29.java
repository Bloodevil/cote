/*
같은 level의 node의 값을 배열로 묶어서 반환하라
저장할 자료구조를 만듬

depth가 늘어날 때 해당 depth와반환형이 List<List<Integer>>
ArrayList<Integer> nodes = new ArrayList<Integer>();
ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

depth만큼 들어가면 해당 depth의 node를 반환하는 메서드가 필요
최대 depth만큼 들어갔다는 기준?
left, right가 모두 null이 나온다면 최대 depth라고 할 수 있다.

1. root가 null이면 아무것도 없이 반환
2. root가 null이 아니라면 depth만큼 저장하는 곳에 넣고 최종 답변인 자료구조에 넣기
3. left와 right를 주고 모두 null이라면 null을 담음
*/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        if(root == null) return result;

        nodes.add(root.val);
        result.add(nodes);

        if(checkDepth(root.left, root.right)) {
            result.add(addNodes(root.left, root.right));
        }

        return result;
    }
    public ArrayList<Integer> addNodes(TreeNode left, TreeNode right) {
        ArrayList<Integer> nodes = new ArrayList<Integer>();
        nodes.add(left.val, right.val);

        if(!checkDepth(left.left, left.right) && !checkDepth(right.left, right.right)) {
            return nodes;
        }
        addNodes(left.left, left.right);
        addNodes(right.left, right.right);

        return nodes;
    }
    public boolean checkDepth(TreeNode left, TreeNode right) {
        if(left == null && right == null) return false;
        return true;
    }
}

// java.lang.IndexOutOfBoundsException: Index: 9, Size: 0