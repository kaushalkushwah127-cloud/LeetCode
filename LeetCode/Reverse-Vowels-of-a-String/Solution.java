1class Solution {
2    public String reverseVowels(String s) {
3        char [] a= s.toCharArray();
4        int i=0, j=a.length-1;
5        while (i<j){
6            if (a[i]=='a' || a[i]== 'e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ||a[i]== 'A' ||a[i]== 'E' ||a[i]== 'I' ||a[i]== 'O' ||a[i]== 'U'){
7                if (a[j]=='a' ||a[j]== 'e' ||a[j]== 'i' ||a[j]== 'o' || a[j]=='u' ||a[j]== 'A' || a[j]=='E' || a[j]=='I' ||a[j]== 'O' || a[j]=='U'){
8                    char c=a[i];
9                    a[i]=a[j];
10                    a[j]=c;
11                    i++;
12                    j--;
13                }
14                else j--;
15            }
16            else i++;
17        }
18        return new String(a);
19
20    }  
21}