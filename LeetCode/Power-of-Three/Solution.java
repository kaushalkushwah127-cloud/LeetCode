1class Solution {
2    public boolean isPowerOfThree(int n) {
3       if (n<=0) return false;
4       while (n%3==0) n/=3;
5       return n==1;
6    }
7}