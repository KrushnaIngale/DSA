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
public class Insert_in_BST_701 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.right=new TreeNode(7);
        root.left.right=new TreeNode(3);
        Insert_in_BST_701 obj=new Insert_in_BST_701();
        TreeNode ans=obj.insertIntoBST(root,5);
        // print new tree
        obj.print(ans);
    }

    void print(TreeNode root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);
        
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode temp=root;
        while(true){
            if(val<root.val){
                if(root.left!=null) root=root.left;
                else{
                    root.left= new TreeNode(val);
                    break;
                }
            }else{
                if(root.right!=null) root=root.right;
                else{
                    root.right= new TreeNode(val);
                    break;
                }
            }            
        }
        return temp;
    }
    
}