1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length()!=t.length()) return false;
4       char [] c=s.toCharArray();
5        char [] d=t.toCharArray();
6        Arrays.sort(c);
7        Arrays.sort(d);
8        for (int i=0; i<c.length; i++){
9            if(c[i]!=d[i]) return false ;
10        }
11        return true;
12    }
13}