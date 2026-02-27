public class Same_Tree_100 {
        public static void main(String[] args) {
            TreeNode root1=new TreeNode(1);
            root1.left=new TreeNode(2);
            root1.right=new TreeNode(3);
    
            TreeNode root2=new TreeNode(1);
            root2.left=new TreeNode(2);
            root2.right=new TreeNode(7);
    
            Same_Tree_100 obj=new Same_Tree_100();
            System.out.println(obj.isSameTree(root1,root2));
            
        }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null)  return p==q;

        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);   
        
    }
}
