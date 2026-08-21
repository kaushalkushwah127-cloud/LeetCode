1class Solution {
2    public String sortSentence(String s) {
3        String [] q=s.split("\\s++");
4        String [] w=new String[q.length];
5        for (int i=0; i<q.length; i++){
6            String temp=q[i];
7            int c=temp.charAt(temp.length()-1)-'0';
8            w[c-1]=temp.substring(0,temp.length()-1);
9        }
10        return String.join(" ",w);
11
12    }
13}