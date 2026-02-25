import java.util.ArrayList;
import java.util.List;

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
 
public class Preorder_traversal_144 {
    List<Integer> tree;
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        Preorder_traversal_144 obj=new Preorder_traversal_144();
        List<Integer> list=obj.preorderTraversal(root);
        System.out.println(list);
    }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        tree=new ArrayList<>();
        preorder(root);
        return tree;
    }
    void preorder(TreeNode root){
        if(root==null)  return;

        tree.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        List<Integer> tree=new ArrayList<>();
        if(root==null)  return tree;
        Stack<TreeNode>st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            tree.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return tree;
    }
}