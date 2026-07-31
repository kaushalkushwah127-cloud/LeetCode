1class Solution {
2    public boolean isPalindrome(int x) {
3        int temp=x,rev=0;
4        while (x>0){
5            rev=rev*10+x%10;
6            x/=10;
7        }
8        return temp==rev;
9    }
10}