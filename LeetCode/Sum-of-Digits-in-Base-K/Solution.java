1class Solution {
2    public int sumBase(int n, int k) {
3      int sum=0;
4      while (n>0){
5        int d=n%k;
6        sum+=d;
7        n/=k;
8      }
9      return sum;
10    }
11}