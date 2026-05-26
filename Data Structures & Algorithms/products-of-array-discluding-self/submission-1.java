class Solution {
    public int[] productExceptSelf(int[] nums) {
    

        int prefix=1,
        postfix=1, 
        n = nums.length;
        int[] result = new int[n];


        for (int i = 0 ; i < nums.length ; i ++){
            result[i]=prefix;
            prefix*=nums[i];
        }

        for(int i = n-1 ; i >=0 ; i--){
            result[i]*=postfix;
            postfix*=nums[i];
        }
        return result;
    }
}  
