class Solution {
    public int trap(int[] height) {
        int[] lMax = new int[height.length];
        int[] rMax = new int[height.length];

        int max = -1;
        int ans = 0;

        for(int i = 0 ; i < height.length ; i++){
            if(height[i] > max){
                max = height[i];
            }
            lMax[i] = max;
        }
        
        max = -1;
        for(int i = height.length - 1 ; i >= 0 ; i--){
            if(height[i] > max){
                max = height[i];
            }
            rMax[i] = max;
        }
        
        for(int i = 0 ; i < height.length ; i++){
            ans += (Math.min(lMax[i],rMax[i]) - height[i]);
        }
        
        return ans;
    }
}
