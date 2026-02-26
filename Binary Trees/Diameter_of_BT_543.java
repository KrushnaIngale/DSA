public class Diameter_of_BT_543 {
    int max=0;

    public int diameterOfBinaryTree(TreeNode root) {
        int ht=height(root);
        return max;
    }
    int height(TreeNode root){
        if(root==null) return 0;

        int l=height(root.left);
        int r=height(root.right);

        max=Math.max(max,l+r);

        return 1+Math.max(l,r);
    }
    // public int diameterOfBinaryTree(TreeNode root) {
    //     diameter(root);
    //     return max;
    // }
    // void diameter(TreeNode root){
    //     if(root==null) return ;

    //     int l=height(root.left);
    //     int r=height(root.right);
        
    //     max=Math.max(max,l+r);
    //     diameter(root.left);
    //     diameter(root.right);

    // }
    // int height(TreeNode root){
    //     if(root==null) return 0;

    //     int l=height(root.left);
    //     int r=height(root.right);

    //     return 1+Math.max(l,r);
    // }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.left.right=new TreeNode(3);

        Diameter_of_BT_543 obj=new Diameter_of_BT_543();
        System.out.println(obj.diameterOfBinaryTree(root));
        
    }
    
}
