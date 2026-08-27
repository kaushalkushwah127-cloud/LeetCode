1class Solution {
2    public boolean isPalindrome(String s) {
3        //String r = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
4        String r="";
5        for (int i=0; i<s.length(); i++){
6            char c=s.charAt(i);
7            if (Character.isLetterOrDigit(c)){
8                r+=Character.toLowerCase(c);
9            }
10        }
11        for (int i=0; i<r.length()/2; i++){
12          if (r.charAt(i)!=r.charAt(r.length()-1-i)){
13            return false;
14          }
15        }
16        return true;
17    }
18}