1class Solution {
2    public int findGCD(int[] nums) {
3        int min=nums[0];
4        int max=0;
5        for (int i=0; i<nums.length; i++){
6            if (nums[i]<min) min=nums[i];
7            if (nums[i]>max) max=nums[i];
8        }
9        for (int i=max; i>1; i--){
10            if (min%i==0 && max%i==0) return i;
11        }
12        return 1;
13    }
14}