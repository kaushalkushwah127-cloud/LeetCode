1class Solution {
2    public boolean isVowel(char c) {
3        return "aeiouAEIOU".indexOf(c) != -1;
4    }    
5    public int maxVowels(String s, int k) {
6        int count=0,left=0,max=0;
7       for (int i=0; i<k; i++){
8         if (isVowel(s.charAt(i))) count++;
9       }  
10       max=count;
11       for (int i=k; i<s.length(); i++){
12         if (isVowel(s.charAt(i))) count++;
13         if (isVowel(s.charAt(left++))) count--;
14         max=Math.max(max,count);
15       }
16       return max;
17    }
18}