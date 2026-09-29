class Solution {
    public int findDuplicate(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){

            int temp;

            if(nums[i] < 0) temp = -1 * nums[i];
            else temp = nums[i];
            
            if(nums[temp-1] < 0) {
                if(nums[i] > 0) return nums[i];
                else return -1 * nums[i];
            }
            else nums[temp-1] = -1 * nums[temp-1];

        }
        
        return -1;
    }
}
