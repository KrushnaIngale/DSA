import java.util.*;

class Sliding_window_maximum_239{
    public static void main(String[] args) {
        Sliding_window_maximum_239 solver = new Sliding_window_maximum_239();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = solver.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(result));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> q = new ArrayDeque<>();  // stores *indices*
        int n=nums.length;
        int[] ans = new int[n-k+1];
        int r=0;
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && nums[q.getLast()] <= nums[i]) {
                q.removeLast();
            }
            q.addLast(i);
            // remove first element if it's outside the window
            if (q.getFirst() == i - k) {
                q.removeFirst();
            }
            // if window has k elements add to results (first k-1 windows have < k elements because we start from empty window and add 1 element each iteration)
            if (i >= k - 1) {
                ans[r++]=(nums[q.peek()]);
            }
        }
        return ans;            
    }

}
