1class Solution {
2    public int[] twoSum(int[] num, int tar) {
3        int left = 0, right = num.length - 1; 
4        while (left < right ) {
5            if (num[left]+num[right]==tar) return new int [] {left+1,right+1};
6            if (num[left]+num[right]>tar) right --;
7            else left ++;
8        }
9        return new int [] {};
10    }
11}