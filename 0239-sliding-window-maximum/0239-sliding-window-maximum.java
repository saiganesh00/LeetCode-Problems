class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> window = new ArrayDeque<>();
        int resultIndex = 0;
        
        for (int i = 0; i < n; i++) {
            // Remove elements that are out of the current window from the front of the deque
            while (!window.isEmpty() && window.peekFirst() < i - k + 1) {
                window.pollFirst();
            }
            
            // Remove elements that are smaller than the current element from the back of the deque
            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }
            
            // Add the current index to the back of the deque
            window.offerLast(i);
            
            // The front of the deque always contains the index of the maximum element for the current window
            if (i >= k - 1) {
                result[resultIndex++] = nums[window.peekFirst()];
            }
        }
        
        return result;
    }
}