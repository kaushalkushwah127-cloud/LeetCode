1class Solution {
2    public int numOfSubarrays(int[] arr, int k, int threshold) {
3        int sum=0,left=0,max=0;
4        for (int i=0; i<k; i++){
5            sum+=arr[i];
6        }
7        int avg=sum/k;
8
9        if (avg>=threshold) max=1;
10        for (int i = k; i<arr.length; i++){
11            sum-=arr[left++];
12            sum+=arr[i];
13            avg=sum/k;
14            if (avg>=threshold) max++;
15        }
16        return max;
17    }
18}