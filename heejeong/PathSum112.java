package heejeong;

import java.util.ArrayList;
import java.util.List;

public class PathSum112 {

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
		if(root == null)  return false;

		if(root.left==null && root.right==null && targetSum-root.val==0) {
			return true;
		}else {
			return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
		}
	}

	/*
	너무 어렵게 풀려고 한것같다. 메모리도 많이쓰이고 시간도 오래걸림.
	public List<Integer> getSum(TreeNode root, int getSum) {
		List<Integer> sumList = new ArrayList<Integer>();
		if(root!=null) {
			getSum += root.val;
			while(root.left!=null || root.right!=null) {
				if(root.left!=null) {
					getSum(root.left, getSum);
				}
				if(root.right!=null) {
					getSum(root.right, getSum);
				}
				sumList.add(getSum);
			}
		}
		return sumList;
	}

	//루트부터 단말 노드부터 더한 값이 target이 되는 경로가 있으면 true
    public boolean hasPathSum(TreeNode root, int targetSum) {
    	boolean hasPath = false;
    	List<Integer> sumList = getSum(root, 0);
    	for(int target :sumList){
    		if(target==targetSum) {
    			hasPath = true;
    		}
    	}
    	return hasPath;
    }
	 */

}
