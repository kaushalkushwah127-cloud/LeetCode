1class Solution {
2    public List<String> fizzBuzz(int n) {
3          List<String> list = new ArrayList<>();
4          for (int i=1; i<=n; i++){
5            if(i%3==0 && i%5==0) list.add("FizzBuzz");
6            else if (i%3==0) list.add("Fizz");
7            else if (i%5==0) list.add("Buzz");
8            else list.add(String.valueOf(i));
9          }
10          return list;
11    }
12}