class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;

        for(int num : nums){
            if(num != 0){
                product *=num;
            }else{
                zeros++;
            }
        }

        if(zeros > 1){
            return new int[nums.length];
        }

        for(int i = 0 ; i < nums.length ; i++){
            if(zeros > 0){
                if(nums[i] == 0){
                    nums[i] = product;
                }else{
                    nums[i] = 0;
                }
            }
            else{
                nums[i] = product/nums[i];
            }
        }

        return nums;
    }
}  
