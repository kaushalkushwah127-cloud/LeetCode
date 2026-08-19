1class Solution {
2    public int lengthOfLastWord(String s) {
3    String [] ar=s.split("\\s+");
4    String q=ar[ar.length-1];
5    return q.length();
6    }
7}