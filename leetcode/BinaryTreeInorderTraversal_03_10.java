/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    // LinkedList 선언
    public List<Integer> inorderList = new ArrayList();
    public List<Integer> inorderTraversal(TreeNode root) {
        Integer temp = null;    // null로 초기화
        /*
        중순위 순회 inorder 기본 규칙
        왼쪽 부트리를 TL 루트를 R 오른쪽 부트리를 TR로 선언
        1. TL 순회
        2. R 순회
        3. TR 순회
        */
        try
        {
            temp = new Integer(root.val);   // null과의 비교를 위한 형변환
        }
        catch(NullPointerException e){}

        if(temp != null)
        {
            inorderTraversal(root.left);
            inorderList.add(root.val);
            inorderTraversal(root.right);
        }
        return inorderList;
    }
}