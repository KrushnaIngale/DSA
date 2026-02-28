import java.util.*;
public class ZigZag_level_order_traversal_103{
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int v){ val = v; }
    }

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

        ZigZag_level_order_traversal_103 solver = new ZigZag_level_order_traversal_103();
        List<List<Integer>> ans = solver.zigzagLevelOrder(root);
        System.out.println(ans); // expected output: [[1],[3,2],[4,5,6]] (zigzag order)
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Deque<TreeNode> q = new LinkedList<>();
        q.addFirst(root);
        boolean flag = false;

        while (!q.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int level = q.size();

            for (int i = 0; i < level; i++) {
                if (!flag) {
                    TreeNode curr = q.pollFirst();
                    current.add(curr.val);
                    if (curr.left != null) q.addLast(curr.left);
                    if (curr.right != null) q.addLast(curr.right);
                } else {
                    TreeNode curr = q.pollLast();
                    current.add(curr.val);
                    if (curr.right != null) q.addFirst(curr.right);
                    if (curr.left != null) q.addFirst(curr.left);
                }
            }
            ans.add(current);
            flag = !flag;
        }
        return ans;
    }
}