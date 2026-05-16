import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        boolean ans=obj.findTarget1(root,9);
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
// -----------------------------------

    public boolean findTarget1(TreeNode root, int k) {
        if(root==null)  return false;
        BSTIterator l= new BSTIterator(root,false);
        BSTIterator r= new BSTIterator(root,true);

        int i=l.next();
        int j=r.next();

        while(i<j){
            if(i+j==k)  return true;
            else if(i+j<k)  i=l.next();
            else    j=r.next();
        }
        return false;
    }

    class BSTIterator{
        Stack<TreeNode> st= new Stack<TreeNode>();
        boolean reverse=true;
        // true ===> before
        // false ==> next

        BSTIterator(TreeNode root,boolean isReverse){
            reverse=isReverse;
            pushAll(root);
        }

        boolean hasNext(){
            return !st.isEmpty();
        }

        int next(){
            TreeNode temp=st.pop();
            if(reverse==false){
                pushAll(temp.right);
            }else{
                pushAll(temp.left);
            }
            return temp.val;
        }

        void pushAll(TreeNode root){
            while(root!=null){
                st.push(root);
                if(reverse==false){
                    root=root.left;
                }else{
                    root=root.right;
                }
            }
        }
    }
}
