1class Solution {
2    public String mergeAlternately(String w1, String w2) {
3        String temp="";
4        int i=0,j=0;
5        while(i<w1.length() || j<w2.length()){
6            if (i<w1.length()){
7                temp+=w1.charAt(i);
8                i++;
9            }
10            if (j<w2.length()){
11                temp+=w2.charAt(j);
12                j++;
13            }
14        }
15        return temp;
16    }
17}