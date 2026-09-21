class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int start = 1;
        int end = 1;
        int ans = Integer.MAX_VALUE;

        for(int i = 0 ; i < piles.length ; i++){
            if(piles[i] > end){
                end = piles[i];
            }
        }
        
        while(start <= end){
    
            int mid = (start + end)/2;
            if( possible(piles,mid) > h){
                start = mid + 1;
            }else {
                ans = Math.min(ans,mid);
                end = mid - 1;
            }
            
        }
        
        return ans;
    }


    public int possible(int[] piles, int mid){
           
           int hours = 0;
           for(int i = 0 ; i < piles.length ; i++){
              
              if(piles[i] <= mid) hours++;
              else {
                 hours += (int)Math.ceil((double)piles[i]/mid);
              }

           }

           return hours;
    }
    
}
