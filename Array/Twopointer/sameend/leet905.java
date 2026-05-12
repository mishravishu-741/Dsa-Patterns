class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length-1;
        }

        int slow=2;
        for(int fast=2;fast<nums.length;fast++){
            if(nums[fast]!=nums[slow-2]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow;
    }
}
