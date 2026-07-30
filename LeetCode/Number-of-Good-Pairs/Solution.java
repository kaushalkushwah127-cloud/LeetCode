1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int count=0;
4        for (int i=0;i<nums.length; i++){
5            for (int j=0; j<i; j++){
6                if (nums[i]==nums[j]) count++;
7            }
8        }
9        return count;
10    }
11}