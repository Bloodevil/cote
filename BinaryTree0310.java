package codingTest;

import java.util.ArrayList;
import java.util.List;

//Given the root of a binary tree,
//return the inorder traversal of its nodes' values.

//The number of nodes in the tree is in the range [0, 100].
//-100 <= Node.val <= 100

//Recursive solution is trivial, could you do it iteratively?

//inorder travesal(중위순회) : 왼 - 자기자신 - 오

public class BinaryTree0310 {

	 //Definition for a binary tree node.
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

	public List<Integer> inorderTraversal(TreeNode root) {
		//순서대로 처음에 들어오는 root가 루트노드
		//그 다음이 left
		//그 다음이 right
		//반복
		List<Integer> list = new ArrayList<Integer>();
		if(root!=null) {
			//첫번째 배열 정렬
			list.add(root.val);

			//해당 루트로 새로 세팅 (?) 어디에서 세팅해야할까
			TreeNode tree = new TreeNode(root.val);

		}else if(root==null) {

		}

		//중위노드는 left - root - right 순으로 순회
		//root가 정해질 때마다 왼쪽 값 있는지 확인
		//있으면 먼저 정렬


		return list;
	}

}
