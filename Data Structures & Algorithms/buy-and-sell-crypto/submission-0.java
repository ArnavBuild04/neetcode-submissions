class Solution {
    public int maxProfit(int[] prices) {
        int lastMin = prices[0];
        int ans = 0;

        for(int i = 1 ; i < prices.length ; i++){
            
            ans = Math.max(ans,prices[i]-lastMin);

            if(prices[i] < lastMin) lastMin = prices[i];

        }

        return ans;
    }
}
