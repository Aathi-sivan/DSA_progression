class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0,res = 0  ;
        for (int i = 0 ; i < n ; i ++){
            count = (nums[i]==1)?count+1:0;
            res = Math.max(res,count);
        }
        return res;
    }
}