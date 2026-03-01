import java.util.ArrayList;
import java.util.List;

public class Boundry_traversal_545 {
    public static void main(String[] args){
        // build sample tree:
        //       1
        //      / \
        //     2   3
        //    / \   \
        //   4   5   6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Boundry_traversal_545 solver = new Boundry_traversal_545();
        List<Integer> ans = solver.boundry(root);
        System.out.println(ans); // expected output: [[1],[3,2],[4,5,6]] (zigzag order)
    }
    boolean isLeaf(TreeNode root){
        if(root.left==null && root.right==null) return true;
        return false;
    }
    public List<Integer> boundry(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(isLeaf(root)) return ans;
        ans.add(root.val);
        leftBoundry(root,ans);
        addLeaves(root,ans);
        rightBoundry(root,ans);
        return ans;
    }
    void leftBoundry(TreeNode root,ArrayList<Integer> ans){
        TreeNode curr=root.left;
        while(curr!=null){
            if(isLeaf(curr)==false) ans.add(curr.val);
            if(curr.left!=null)     curr=curr.left;
            else    curr=curr.right;
        }
    }

    void rightBoundry(TreeNode root,ArrayList<Integer> ans){
        TreeNode curr=root.right;
        while(curr!=null){
            if(isLeaf(curr)==false) ans.add(curr.val);
            if(curr.right!=null)    curr=curr.right;
            else    curr=curr.left;
        }
    }

    void addLeaves(TreeNode root,ArrayList<Integer> ans){
        if(isLeaf(root)){
            ans.add(root.val);
            return;
        }
        if(root.left!=null) addLeaves(root.left,ans);
        if(root.right!=null) addLeaves(root.right,ans);
    }
}
