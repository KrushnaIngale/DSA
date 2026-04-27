import java.util.ArrayList;
import java.util.List;

public class Kth_Smallest_El_in_BST_230 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(1);
        root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);
        Kth_Smallest_El_in_BST_230 obj=new Kth_Smallest_El_in_BST_230();
        int ans=obj.kthSmallest(root,3);
        System.out.println(ans);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder=new ArrayList<>();
        inOrder(root,inorder);

        int ans=inorder.get(k-1);
        return ans;
    }
    void inOrder(TreeNode root,List<Integer> inorder){
        if(root==null)  return;
        inOrder(root.left,inorder);
        inorder.add(root.val);
        inOrder(root.right,inorder);
    }
}
