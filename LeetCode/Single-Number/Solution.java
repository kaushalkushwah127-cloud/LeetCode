1class Solution {
2    public int singleNumber(int[] nums) {
3        int m=0;
4        for (int n:nums){
5            m^=n;
6        }
7        return m;
8    }
9}