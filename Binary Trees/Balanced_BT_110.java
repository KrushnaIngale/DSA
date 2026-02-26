public class Balanced_BT_110 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.left.right=new TreeNode(3);

        Balanced_BT_110 obj=new Balanced_BT_110();
        System.out.println(obj.isBalanced(root));
        
    }
    public boolean isBalanced(TreeNode root) {
        return htDiff(root) != -1;
    }
    int htDiff(TreeNode root){
        if(root==null) return 0;

        int l=htDiff(root.left);
        if(l==-1) return -1;
        int r=htDiff(root.right);
        if(r==-1) return -1;
        
        if(Math.abs(l-r) > 1) return -1;

        return 1+Math.max(l,r);
    }
}
