1class Solution {
2    public boolean isPalindrome(String s) {
3        String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
4        for (int i=0; i<r.length()/2; i++){
5          if (r.charAt(i)!=r.charAt(r.length()-1-i)){
6            return false;
7          }
8        }
9        return true;
10    }
11}