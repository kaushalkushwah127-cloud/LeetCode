1class Solution {
2    public String longestCommonPrefix(String[] str) {
3        Arrays.sort(str);
4        String first = str[0];
5        String last = str[str.length - 1];
6        int i = 0; 
7        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) i++;
8        return first.substring(0, i);
9    }
10}