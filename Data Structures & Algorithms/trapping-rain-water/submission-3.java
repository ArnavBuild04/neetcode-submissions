class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int leftMax = -1;
        int right = height.length - 1;
        int rightMax = -1;
        int ans = 0;

        while(left < right){

            if(height[left] < height[right]){
                
                if(height[left] > leftMax){
                    leftMax = height[left];
                }
                
                ans += leftMax - height[left];
                left++;
            } else{
                
                if(height[right] > rightMax){
                    rightMax = height[right];
                }
                
                ans += rightMax - height[right];
                right--;
            }

        }

        return ans;

    }
}
