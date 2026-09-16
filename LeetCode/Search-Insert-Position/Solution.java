1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        ArrayList <Integer> list = new ArrayList <> ();
4        for ( int i :nums) list.add(i);
5        if (list.contains(target)) return list.indexOf(target);
6        else list.add(target);
7        list.sort(null);
8        return list.indexOf(target);
9    }
10}