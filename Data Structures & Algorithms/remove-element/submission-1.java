class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0 ,j = nums.length - 1;

        for(int i = 0 ; i <= j ; i ++)
        {
         if(nums[i]==val){
            while(j > i && nums[j] == val) {
                j--;
            }
            nums[i]=nums[j];
            j--;
         }
         if (i <= j) k++;
        }
        return k;
        
    }
    
    }