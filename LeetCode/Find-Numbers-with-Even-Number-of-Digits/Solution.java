1class Solution {
2    public int findNumbers(int[] nums) {
3        int sum=0;
4        for (int i=0; i<nums.length; i++){
5            if ( ((int) Math.log10(nums[i]) +1)%2==0) sum++;
6        }
7        return sum;
8    }
9}