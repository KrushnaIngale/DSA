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

public class Search_in_BST_700 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.right=new TreeNode(7);
        root.left.right=new TreeNode(3);
        Search_in_BST_700 obj=new Search_in_BST_700();
        TreeNode ans=obj.searchBST(root,2);
        System.out.println(ans.val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null && root.val!=val){
            root=val<root.val?root.left:root.right;
        }
        return root;
    }

     public TreeNode searchBST1(TreeNode root, int val) {
        if(root==null){
            return null;
        }
        if(val<root.val){
            return searchBST(root.left,val);
        }else if(val>root.val){
            return searchBST(root.right,val);
        }else{
            return root;
        }
    }

    void print(TreeNode root){
        while(root!=null){

        }
    }
    
}
