1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        if (num<2) return false;
4        int sum=1;
5        for (int i=2; i<num; i++){
6            if(num%i==0) sum+=i;
7        }
8        return num==sum;
9    }
10}