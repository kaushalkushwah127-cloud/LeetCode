1class Solution {
2    public int maxSubArray(int[] nums) {
3        int max=Integer.MIN_VALUE,csum=0;
4        for (int i=0; i<nums.length; i++){
5            csum+=nums[i];
6            max=Math.max(csum,max);
7            if (csum<0) csum=0;
8        }
9        return max;
10    }
11}