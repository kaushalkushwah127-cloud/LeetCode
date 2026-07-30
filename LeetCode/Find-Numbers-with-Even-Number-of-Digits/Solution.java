1class Solution {
2    public int findNumbers(int[] nums) {
3        int sum=0;
4        for (int i=0; i<nums.length; i++){
5            int s=nums[i];
6            int y= (int) Math.log10(s) +1 ;
7            if (y%2==0) sum++;
8        }
9        return sum;
10    }
11}