class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
            if(target > nums[end]) {
               return nums.length; 
            }
            if(target < nums[start]) {
                return 0;
            }
            for(int i=1;i<nums.length;i++){
                if(target>nums[i-1] && target<nums[i]){
                    return i;
                } 
                if(target == nums[i]){
                    return i;
                }
            }
        return 0;
        }
}
