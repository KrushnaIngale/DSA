import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//  * Definition for a binary tree node.
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

public class Inorder_traversal_94 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        Inorder_traversal_94 obj=new Inorder_traversal_94();
        List<Integer> list=obj.inorderTraversal(root);
        System.out.println(list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        inorder(root,tree);
        return tree;
    }
    List<Integer> inorder(TreeNode root,List<Integer> tree){
        if(root==null)  return tree;

        inorder(root.left,tree);
        tree.add(root.val);
        inorder(root.right,tree);
        return tree;
    }
    public List<Integer> inorderTraversal1(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        Stack<TreeNode>st=new Stack<>();
        TreeNode node=root;
        while(true){
            if(node!=null){
                st.push(node);
                node=node.left;
            }else{
                if(st.isEmpty())    break;
                node=st.pop();
                tree.add(node.val);
                node=node.right;
            }
        }
        return tree;
    }
}
