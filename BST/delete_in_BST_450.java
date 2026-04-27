//  Definition for a binary tree node.
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
 
public class delete_in_BST_450{
    public static void main(String[] args) {
            TreeNode root=new TreeNode(5);
            root.left=new TreeNode(3);
            root.right=new TreeNode(6);
            root.left.left=new TreeNode(2);
            root.left.right=new TreeNode(4);
            root.right.right=new TreeNode(7);
            delete_in_BST_450 obj=new delete_in_BST_450();
            obj.deleteNode(root, 3);

            obj.print(root);
        }
        void print(TreeNode root) {
            if (root == null) return;
            print(root.left);
            System.out.print(root.val + " ");
            print(root.right);
            
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)  return null;
        if(root.val==key)   return helper(root);
        TreeNode dummy=root;
        while(root!=null){
            if(key<root.val){
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }else{
                    root=root.right;
                }
            }
        }
        return dummy;
    }
    TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null)   return root.left;
        else{
            TreeNode rightChild=root.right;
            TreeNode lastRight=findLastRight(root.left);
            lastRight.right=rightChild;
            return root.left;
        }
    }
    TreeNode findLastRight(TreeNode root){
        if(root.right==null)  return root;
        return findLastRight(root.right);
    }
}