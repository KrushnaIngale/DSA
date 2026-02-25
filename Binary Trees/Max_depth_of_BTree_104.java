
public class Max_depth_of_BTree_104 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        Max_depth_of_BTree_104 obj=new Max_depth_of_BTree_104();
        System.out.println(obj.maxDepth(root));
    }
    public int maxDepth(TreeNode root) {
        if(root==null)  return 0;
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);

        return 1 + Math.max(l,r);
    }
}
