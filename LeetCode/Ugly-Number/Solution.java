1class Solution {
2    public boolean isUgly(int n) {
3        if (n<=0) return false;
4     while (n%2==0 || n%3==0 || n%5==0){
5        if (n%2==0) n/=2;
6        else if (n%3==0) n/=3;
7        else if (n%5==0) n/=5;
8     }
9    return n==1;
10    }
11}