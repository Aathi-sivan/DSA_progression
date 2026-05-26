class Solution {
    public int[] productExceptSelf(int[] nums) {
        int j = 0,productofNums=1;
        int[] finalArray = new int [nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            if(i==j)
            continue;
            else if (i==nums.length-1){
                productofNums*=nums[i];
                finalArray[j]=productofNums;
                j++;
                i=-1;
                productofNums=1;
            }
            else{
               productofNums*=nums[i]; 
            }
        }
        if(finalArray[nums.length-1]==0)
        finalArray[nums.length-1]=productofNums;
        return finalArray;
    }
}  
