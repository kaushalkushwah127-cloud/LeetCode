1class Solution {
2    public int maxArea(int[] height) {
3        int left =0;
4        int right = height.length-1;
5        int max=0;
6        while (left<right){
7            int min=Math.min(height[left],height[right]);
8            int length=right-left;
9            max=Math.max(max,min*length);
10            if (height[left]<height[right]) left++;
11            else right--;
12        }
13        return max;
14    }
15}