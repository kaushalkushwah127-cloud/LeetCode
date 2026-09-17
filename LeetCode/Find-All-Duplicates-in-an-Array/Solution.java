1class Solution {
2    public List<Integer> findDuplicates(int[] arr) {
3        ArrayList<Integer> list = new ArrayList <>();
4        Set <Integer> set = new HashSet <> ();
5        for (int i=0; i<arr.length; i++){
6            if (set.contains(arr[i])){
7                list.add(arr[i]);
8            }
9            else set.add(arr[i]);
10        }
11        return list;
12    }
13}