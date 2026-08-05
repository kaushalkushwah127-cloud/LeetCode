1class Solution {
2    public int findNumbers(int[] nums) {
3        int sum=0;
4        for (int i=0; i<nums.length; i++){
5            int y= (int) Math.log10(nums[i]) +1 ;
6            if (y%2==0) sum++;
7        }
8        return sum;
9    }
10}