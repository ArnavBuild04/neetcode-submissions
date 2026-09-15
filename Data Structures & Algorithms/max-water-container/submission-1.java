class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0;
        int j = heights.length -1;
        int ans = 0;

        while(i < j){

            int water = (Math.min(heights[i],heights[j]))*(j-i);
            ans = Math.max(ans,water);
            
            if(heights[i] > heights[j]) j--;
            else i++;
        }

        return ans;
    }
}
