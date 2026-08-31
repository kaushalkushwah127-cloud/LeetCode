1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum=0,max=Integer.MAX_VALUE,left=0;
4        for (int i=0; i<nums.length; i++){
5            sum+=nums[i];
6            while (sum>=target){
7                max=Math.min(max,i-left+1);
8                sum-=nums[left++];
9            }
10        }
11        return max==Integer.MAX_VALUE ? 0 : max;
12    }
13}