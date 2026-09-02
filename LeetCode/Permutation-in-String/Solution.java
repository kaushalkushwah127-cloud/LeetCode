1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n=s1.length(),m=s2.length(),left=0;
4        if (n>m) return false;
5        int a[] = new int [26];
6        int b[] = new int [26];
7        for (int i=0; i<n; i++){
8            a[s1.charAt(i)-'a']++;
9            b[s2.charAt(i)-'a']++;
10        }
11        if (Arrays.equals(a,b)) return true;
12        for ( int i=n; i<m; i++){
13            b[s2.charAt(i)-'a']++;
14            b[s2.charAt(left++)-'a']--;
15            if (Arrays.equals(a,b)) return true;
16        }
17        return false;
18    }
19}