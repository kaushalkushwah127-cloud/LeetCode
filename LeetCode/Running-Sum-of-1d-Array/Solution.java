1class Solution {
2    public int[] runningSum(int[] nums) {
3        int [] x= new int [nums.length];
4        int sum=0;
5        for (int i=0; i<nums.length; i++){
6            sum+=nums[i];
7            x[i]=sum;
8        }
9        return x;
10    }
11}