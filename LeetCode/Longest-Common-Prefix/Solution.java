1class Solution {
2    public String longestCommonPrefix(String[] str) {
3        Arrays.sort(str);
4        String first = str[0], last = str[str.length - 1];
5        int i = 0; 
6        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) i++;
7        return first.substring(0, i);
8    }
9}