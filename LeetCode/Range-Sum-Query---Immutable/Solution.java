1class NumArray {
2    int prefix[];
3    public NumArray(int[] nums) {
4        prefix = new int [nums.length];
5        prefix[0]=nums[0];
6        for (int i=1; i<nums.length; i++) 
7            prefix[i]=prefix[i-1]+nums[i];
8    }
9    public int sumRange(int left, int right) {
10        if (left==0) return prefix[right];
11        else return prefix[right]-prefix[left-1];   
12    }
13}
14
15/**
16 * Your NumArray object will be instantiated and called as such:
17 * NumArray obj = new NumArray(nums);
18 * int param_1 = obj.sumRange(left,right);
19 */