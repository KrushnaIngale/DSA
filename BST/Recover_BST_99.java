import java.util.ArrayList;
import java.util.List;

class TreeNode{
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

public class Recover_BST_99 {
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode second=null;
// optimized
    public void recoverTree(TreeNode root) {
        inOrder(root);

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    void inOrder(TreeNode root){
        if(root==null) return ;
        inOrder(root.left);
        if(prev!=null && prev.val > root.val){
            if(first==null){
                first=prev;
            }
            second=root;
        }
        prev=root;
        inOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.right.left=new TreeNode(2);

        Recover_BST_99 obj=new Recover_BST_99();
        obj.print(root);
        obj.recoverTree(root);
        System.out.println();        
        obj.print(root);
    }

    void print(TreeNode root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);
        
    }
// better
    public void recoverTree1(TreeNode root) {
        List<TreeNode>inorder=new ArrayList<>();
        inOrder(root,inorder);

        TreeNode first=null;
        TreeNode second=null;

        for(int i=0;i<inorder.size()-1;i++){
            if(inorder.get(i).val>inorder.get(i+1).val){
                if(first==null){
                    first=inorder.get(i);
                }
                second=inorder.get(i+1);
            }
        }

        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }
    void inOrder(TreeNode root,List<TreeNode>inorder){
        if(root==null) return ;
        inOrder(root.left,inorder);
        inorder.add(root);
        inOrder(root.right,inorder);
    }
}
