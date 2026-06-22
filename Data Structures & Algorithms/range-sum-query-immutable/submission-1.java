class NumArray {
    
    int[] prefix;

    public NumArray(int[] nums) {

        prefix = new int[nums.length];
        int count = 0;
        for (int i = 0 ; i < nums.length ; i ++){
            count +=nums[i];
            prefix[i] = count ;
        }
    }

    public int sumRange(int left, int right) {
         if (left > 0) {
           return prefix[right]-prefix[left - 1];
        } else
        return prefix[right];
    }
    }

