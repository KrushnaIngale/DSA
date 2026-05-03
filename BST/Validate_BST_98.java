public class Validate_BST_98 {
        public static void main(String[] args) {
            TreeNode root=new TreeNode(2);
            root.left=new TreeNode(1);
            root.right=new TreeNode(3);
            Validate_BST_98 obj=new Validate_BST_98();
            boolean ans=obj.isValidBST(root);
            System.out.println(ans);
        }
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    boolean helper(TreeNode root,long min,long max){
        if(root==null) return true;

        if(root.val<=min || root.val>=max)   return false;

        return(helper(root.left,min,root.val) && helper(root.right,root.val,max));
    }
}
