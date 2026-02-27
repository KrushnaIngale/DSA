public class BT_Max_path_sum_124 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BT_Max_path_sum_124 obj = new BT_Max_path_sum_124();
        System.out.println(obj.maxPathSum(root));
    }
    
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int maxHeightValue=maxPath(root);
        return max;
    }
    int maxPath(TreeNode root){
        if(root==null)  return 0;

        int l=Math.max(0,maxPath(root.left));
        int r=Math.max(0,maxPath(root.right));

        max=Math.max(max, root.val+l+r);

        return (root.val+Math.max(l,r));
    }
    
}
