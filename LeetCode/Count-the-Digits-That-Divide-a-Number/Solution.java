1class Solution {
2    public int countDigits(int num) {
3     int count=0,temp=num;
4     while (num>0){
5        if (temp%(num%10)==0) count++;
6        num/=10;
7     }
8     return count;
9    }
10}