public class Symmetric_tree_101 {
    public static void main(String[] args){
        // build sample tree:
        //       1
        //      / \
        //     2   2
        //    / \ / \
        //   3  4 4  3
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        Symmetric_tree_101 solver = new Symmetric_tree_101();
        boolean ans = solver.isSymmetric(root);
        System.out.println(ans); // expected output: true (tree is symmetric)
    }
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left,root.right);
    }

    boolean isMirror(TreeNode p,TreeNode q){
        if(p==null || q==null) return p==q;

        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
}