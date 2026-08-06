1class Solution {
2    public int missingNumber(int[] nums) {
3       int n=nums.length;
4       int sum=(n*(n+1))/2;
5       int s=0;
6        for (int i=0; i<nums.length; i++){
7            s+=nums[i];
8        }
9        return sum-s;
10
11    }
12}