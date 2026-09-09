1class Solution {
2    public long maximumSubarraySum(int[] nums, int k) {
3        Set<Integer> set=new HashSet <>();
4        int left=0;
5        long sum=0,max=0;
6        for (int i=0; i<nums.length; i++){
7            while (set.contains(nums[i])){
8                sum-=nums[left];
9                set.remove(nums[left]);
10                left++;
11            }
12            set.add(nums[i]);
13            sum+=nums[i];
14            if (set.size()==k){
15                max=Math.max(max,sum);
16                set.remove(nums[left]);
17                sum-=nums[left];
18                left++;
19            }
20
21        }
22        return max;
23      
24    }
25}