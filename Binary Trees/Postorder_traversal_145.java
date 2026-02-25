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

public class Postorder_traversal_145 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        Postorder_traversal_145 obj=new Postorder_traversal_145();
        List<Integer> list=obj.postorderTraversal(root);
        System.out.println(list);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        postorder(root,tree);
        return tree;
    }
    List<Integer> postorder(TreeNode root,List<Integer>tree){
        if(root==null)  return tree;

        postorder(root.left,tree);
        postorder(root.right,tree);
        tree.add(root.val);
        return tree;
    }
    public List<Integer> postorderTraversal1(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        if(root==null)  return tree;
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>st2=new Stack<>();
        
        st1.push(root);
        while(!st1.isEmpty()){
            root=st1.pop();
            st2.add(root);
            if(root.left!=null) st1.push(root.left);
            if(root.right!=null) st1.push(root.right);
        }
        while(!st2.isEmpty()){
            tree.add(st2.pop().val);
        }
        return tree;
    }
}
