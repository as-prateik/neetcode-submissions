class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return nums.length;

        Set<Integer> nums_set = new HashSet<>();

        for(int num:nums){
            nums_set.add(num);
        }

        int longestSequence = 0;

        for(int num:nums_set){
            if(!nums_set.contains(num-1)){
                int currNum = num;
                int currStreak = 1;

                while(nums_set.contains(currNum+1)){
                    currNum++;
                    currStreak++;
                }

                longestSequence = Math.max(longestSequence,currStreak);
            }
        }

        return longestSequence;
    }
}
