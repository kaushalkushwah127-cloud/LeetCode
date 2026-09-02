1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List<Integer> ans = new ArrayList<>();
4        int n=s.length(),m=p.length();
5        if (m>n) return ans;
6        int a[] =new int [26];
7        int b[] =new int [26];
8        for (int i=0; i<m; i++){
9            a[s.charAt(i)-'a']++;
10            b[p.charAt(i)-'a']++;
11        }
12        if (Arrays.equals(a,b)) ans.add(0);
13        for (int i=m; i<n; i++){
14            a[s.charAt(i)-'a']++;
15            a[s.charAt(i-m)-'a']--;
16            if (Arrays.equals(a,b)) ans.add(i-m+1);
17        }
18        return ans;
19    }
20}  