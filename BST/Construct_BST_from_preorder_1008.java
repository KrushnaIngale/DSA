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

public class Construct_BST_from_preorder_1008{
    public static void main(String[] args) {
        int[] preorder={8,5,1,7,10,12};
        Construct_BST_from_preorder_1008 obj=new Construct_BST_from_preorder_1008();
        TreeNode ans=obj.bstFromPreorder(preorder);
        System.out.println(ans.val);
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    TreeNode helper(int[] preorder, int max, int[] i){
        if(i[0]==preorder.length ||preorder[i[0]]>max)   return null;

        TreeNode root = new TreeNode(preorder[i[0]++]);

        root.left=helper(preorder, root.val, i);
        root.right=helper(preorder, max, i);

        return root;
    }
}