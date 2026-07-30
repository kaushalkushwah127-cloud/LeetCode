1class Solution {
2    public boolean isSameAfterReversals(int num) {
3        int temp=num,n=0;
4        while (num>0){
5            n=n*10+num%10;
6            num/=10;
7        }
8        int p=0;
9        while (n>0){
10            p=p*10+n%10;
11            n/=10;
12        }
13        return (p==temp ? true : false );
14    }
15}