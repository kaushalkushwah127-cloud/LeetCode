1class Solution {
2    public int searchInsert(int[] nums, int target) {
3       int o=0; 
4       for (int i=0; i<nums.length; i++){
5        if (target==nums[i]){
6            o=i;
7            break;
8        }
9        else {
10            if (target<nums[i]){
11                o=i;
12                break;
13            }
14            else o=nums.length;
15        }
16       }
17       return o;
18    
19    }
20}