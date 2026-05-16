import java.util.ArrayList;
import java.util.List;

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
public class Two_Sum_IV_653 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.right.right=new TreeNode(7);
        Two_Sum_IV_653 obj=new Two_Sum_IV_653();
        boolean ans=obj.findTarget(root,9);
        System.out.println(ans);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inOrder=inorder(root,new ArrayList<>());
        int i=0;
        int j=inOrder.size()-1;
        while(i<j){
            int temp=inOrder.get(i)+inOrder.get(j);
            if(temp==k)    return true;
            else if(temp<k)    i++;
            else    j--;
        }
        return false;
    }
    List<Integer> inorder(TreeNode root,List<Integer> ans){
        if(root==null)  return null;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

        return ans;
    }
}
