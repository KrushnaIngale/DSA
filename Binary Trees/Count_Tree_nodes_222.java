public class Count_Tree_nodes_222 {
    int count;
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        count++;
        countNodes(root.left);
        countNodes(root.right);

        return count;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.left.right=new TreeNode(3);
        Count_Tree_nodes_222 obj=new Count_Tree_nodes_222();
        System.out.println(obj.countNodes(root));
    }
}
