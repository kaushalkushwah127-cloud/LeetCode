1class Solution {
2    public int maxSubArray(int[] nums) {
3        int sum = 0, max = nums[0];
4        for (int n : nums) {
5            sum = Math.max(n, sum + n);
6            max = Math.max(max, sum);
7        }
8        return max;
9    }
10}