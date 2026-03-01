import java.util.ArrayList;
import java.util.List;

public class Right_side_view_BT_199 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        root.right.left.right=new TreeNode(3);

        Right_side_view_BT_199 solver=new Right_side_view_BT_199();
        List<Integer> ans=solver.rightSideView(root);
        System.out.println(ans);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }
    void rightView(TreeNode root,List<Integer> ans, int level){
        if(root==null)  return;

        if(level==ans.size())   ans.add(root.val);

        rightView(root.right,ans,level+1);
        rightView(root.left,ans,level+1);
    }
}
