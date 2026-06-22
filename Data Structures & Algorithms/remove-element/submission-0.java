class Solution {
    public int removeElement(int[] nums, int val) {
        int[] res = new int[nums.length];
        int j = 0 ;
        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i]==val){

                nums[i]=0;
            }
            else{
                res[j]=nums[i];
                j++;
            }
        }
        return res;
    }
}