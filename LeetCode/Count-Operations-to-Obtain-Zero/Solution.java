1class Solution {
2    public int countOperations(int num1, int num2) {
3        int count =0;
4        while (num1>0 && num2>0){
5            if (num1>num2){
6                num1=num1-num2;
7                count++;
8            }
9            else {
10                num2=num2-num1;
11                count++;
12            }
13        }
14        return count;
15    }
16}