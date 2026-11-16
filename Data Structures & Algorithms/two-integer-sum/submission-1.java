class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complement = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            complement.put(target-nums[i],i);
        }

        for(int j = 0;j<nums.length;j++){
            if(complement.containsKey(nums[j]) && j!=complement.get(nums[j])){
                return new int[]{j,complement.get(nums[j])};
            }
        }

        return null;
    }
}
