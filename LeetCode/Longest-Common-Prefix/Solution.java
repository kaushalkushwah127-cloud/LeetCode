1class Solution {
2    public String longestCommonPrefix(String[] str) {
3
4        Arrays.sort(str);
5
6        String first = str[0];
7        String last = str[str.length - 1];
8
9        int i = 0;
10
11        while (i < first.length() &&
12               i < last.length() &&
13               first.charAt(i) == last.charAt(i)) {
14            i++;
15        }
16
17        return first.substring(0, i);
18    }
19}