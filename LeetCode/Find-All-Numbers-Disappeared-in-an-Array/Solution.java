1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        ArrayList<Integer> list = new ArrayList<>();
4        Set <Integer> set = new HashSet <>();
5        for (int i : nums) set.add(i);
6        for (int i=1; i<=nums.length; i++){
7            if (!set.contains (i)) list.add(i);
8        }
9        return list;
10    }
11}