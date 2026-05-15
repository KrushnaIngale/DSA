import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class BST_iterator{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(7);
        root.left = new TreeNode(3);
        root.right = new TreeNode(15);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(20);

        BSTIterator obj = new BSTIterator(root);
        System.out.println(obj.next());    // return 3
        System.out.println(obj.next());    // return 7
        System.out.println(obj.hasNext()); // return True
        System.out.println(obj.next());    // return 9
        System.out.println(obj.hasNext()); // return True
        System.out.println(obj.next());    // return 15
        System.out.println(obj.hasNext()); // return True
        System.out.println(obj.next());    // return 20
        System.out.println(obj.hasNext()); // return False
    }
    
}
class BSTIterator {
    Stack<TreeNode> st = new Stack<>();

    public BSTIterator(TreeNode root) {
        pushAll(root);
    }
    
    public int next() {
        TreeNode node = st.pop();
        pushAll(node.right);
        return node.val;
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }

    private void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            root=root.left;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */