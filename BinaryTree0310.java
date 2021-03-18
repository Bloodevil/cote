import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

	 // 탐색
	public void searchTree(TreeNode root, List<Integer> list ){
		if(root != null){
			if(root.left != null){
				searchTree(root.left, list);
			}
			list.add(root.val);
			if(root.right != null) searchTree(root.right, list);
		}
	}

	public List<Integer> inorderTraversal(TreeNode root) {
			List<Integer> list = new ArrayList<Integer> ();
			searchTree(root, list);
			return list;
	}

	// 스택 활용
	public List<Integer> inorderTraversal2(TreeNode root) {
			List<Integer> list = new ArrayList<Integer> ();
			Stack<TreeNode> stack = new Stack <TreeNode> ();
			TreeNode curr = root;
			while(curr!=null || !stack.isEmpty()){
				while(curr!=null){
					stack.push(curr);
					curr = curr.left;
				}
				curr = stack.pop();
				list.add(curr.val);
				curr = curr.right;
			}
			return list;
	}

	// 또 다른 방법
	public List<Integer> inorderTraversal3(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		TreeNode curr = root;
		TreeNode pre;
		while(curr!=null){
			if(curr.left == null){
				list.add(curr.val);
				curr = curr.right;	//move to next right node
			} else {	//has a left subtree
				pre = curr.left;
				while(pre.right!=null){	//find rightmost
					pre = pre.right;
				}
				pre.right = curr;	//put cur after the pre node
				TreeNode temp = curr;	//store cur node
				curr = curr.left;	//move cur to the top of the new tree
				temp.left = null;	//original cur left be null to aviod infinite loops
			}
		}//while
		return list;
	}

}
