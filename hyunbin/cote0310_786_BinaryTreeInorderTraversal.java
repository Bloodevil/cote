import java.util.ArrayList;
import java.util.List;

public class cote0310_786_BinaryTreeInorderTraversal {
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
        List<Integer> list=new ArrayList<>();
        //왼쪽 노드가 있으면 왼쪽 노드를 먼저 방문하고
        //더 이상 왼쪽 노드가 없는 왼쪽 노드를 방문했거나 왼쪽 노드가 없으면 루트를 방문하고
        //그 다음엔 오른쪽 노드를 방문한다.

        //왼쪽 노드를 방문하기 위해서는 우선 왼쪽 노드값이 null인지 아닌지 판단해야 한다 
        if(root.left != null){ //왼쪽 노드가 널값이 아니면 왼쪽 노드 방문
            //근데 재귀로 들어가야 하는 거 같다. 결국 왼쪽 노드가 널인지 아닌지를 계속 판단해줘야 한다.
        }else{ //왼쪽 노드가 널이면 루트 방문 후 오른쪽 방문

        }
        boolean bool=true;
        TreeNode leftNode=root;
        TreeNode rootNode;
        TreeNode rightNode;
        while(leftNode.left != null){ //왼쪽이 아니면 왼쪽의 왼쪽을 또 찾아준다
            rootNode=visitLeft(leftNode);
            rightNode=new TreeNode(leftNode.right.val, leftNode.right.left, leftNode.right.right);
            leftNode=rootNode;

            //leftRootNode의 왼쪽 노드가 널이면 루트가 leftNode가 된다
            if(rootNode.left==null){
                list.add(rootNode.val); //이제 루트값을 넣어주고
                if(rightNode.left != null){ //오른쪽 노드에 왼쪽 노드가 달려있는지 검사한다

                }
            }
            //leftRootNode의 왼쪽 노드가 널이 아니면 visitLeft가 한번 더 돌아간다 

            //왼쪽 노드를 방문한 뒤에 rightNode가 널인지 아닌지 검사한다

            //rightNode가 널이면 루트노드를 타고 올라간다 

            //rightNode가 널이 아니면 right노드를 leftRootNode삼아 visitLeft를 실행한다

        } //와일문을 벗어나면 왼쪽노드가 널값인 leftNode가 나오게 됨

        list.add(leftNode.val); //그럼 그 값을 리스트에 더해주고
        list.add(rootNode.val);  //이제 루트값을 넣어주고
        list.add(rootNode.right.val); //오른쪽값을 넣어준다

        return list;
    }

    public static TreeNode visitLeft(TreeNode root){
        return TreeNode(root.left.val, root.left.left, root.left.right);
    }

    public static TreeNode findRoot(TreeNode root){
        return TreeNode(root.left.val, root.left.left, root.left.right);
    }

    public void makeNodeList(List<Integer> list, TreeNode rootNode){
        //삽질한 흔적 2        
        if(rootNode.left == null && rootNode.right == null){ //더 이상 자식노드가 없으면 
            list.add(rootNode.val); //리스트에 밸류 더하고
            //거슬러 올라가야 하는디
            makeNodeList(list, parentNode);
        }else if(rootNode.left != null){ //왼쪽 자식 노드가 있으면 왼쪽 노드를 루트 노드로 삼아서 다시 탐색
            makeNodeList(list, rootNode.left);
        }else if(rootNode.left == null && rootNode.right != null){ //왼쪽 자식 노드는 없고 오른쪽 자식 노드만 있으면
            makeNodeList(list, rootNode.right); //오른쪽 노드를 루트 노트 삼아서 다시 탐색
        }

        //디스커션 정답 보고 정리한 코드
        if(rootNode == null){
            return;
        }
        makeNodeList(list, rootNode.left);
        list.add(rootNode.val);
        makeNodeList(list, rootNode.right);
    }
}

//왼쪽이 있는지 확인한다
//왼쪽이 없으면 오른쪽을 더한다
//오른쪽도 없으면 루트를 더한다
