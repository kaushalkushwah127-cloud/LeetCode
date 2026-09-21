1class Solution {
2    public int[] runningSum(int[] nums) {
3        int [] x= new int [nums.length];
4        x[0]=nums[0];
5        for (int i=1; i<nums.length; i++){
6            x[i]=x[i-1]+nums[i];
7        }
8        return x;
9    }
10}