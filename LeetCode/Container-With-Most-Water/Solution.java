1class Solution {
2    public int maxArea(int[] height) {
3        int l = 0;
4        int r = height.length - 1;
5        int m = 0;
6
7        while (l < r) {
8            int h = Math.min(height[l], height[r]);
9            int w= r - l;
10            int a= h * w;
11
12            m = Math.max(m, a);
13
14            if (height[l] < height[r]) {
15                l++;
16            } else {
17                r--;
18            }
19        }
20
21        return m;
22    }
23}