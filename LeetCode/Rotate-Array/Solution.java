1class Solution {
2    public static void reverse(int[] a, int i, int j) {
3            while (i < j) {
4                int temp = a[i];
5                a[i] = a[j];
6                a[j] = temp;
7                i++;
8                j--;
9             }
10        }
11    public void rotate(int[] nums, int k) {
12        
13        k=k%nums.length;
14        k=nums.length-1-k;
15        reverse (nums ,0,k);
16        reverse (nums ,k+1,nums.length-1);
17        reverse (nums ,0, nums.length-1);
18        
19    }
20}