1class Solution {
2    public int lengthOfLastWord(String s) {
3    String [] ar=s.split("\\s+");
4    return ar[ar.length-1].length();
5    }
6}