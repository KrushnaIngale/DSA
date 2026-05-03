public class LCA_BST_235 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(6);
        root.left=new TreeNode(2);
        root.right=new TreeNode(8);
        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(4);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(9);
        root.left.right.left=new TreeNode(3);
        root.left.right.right=new TreeNode(5);
        LCA_BST_235 obj=new LCA_BST_235();
        TreeNode ans=obj.lowestCommonAncestor(root,new TreeNode(2),new TreeNode(8));
        System.out.println(ans.val);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)  return null;
        int curr=root.val;
        if(p.val<curr && q.val<curr)
            return lowestCommonAncestor(root.left,p,q);
        if(p.val>curr && q.val>curr)
            return lowestCommonAncestor(root.right,p,q);
        return root;
    }
}
