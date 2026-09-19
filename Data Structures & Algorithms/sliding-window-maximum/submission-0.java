class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int[] ans = new int[nums.length-k+1];
        int idx = 0;


        int i = 0 , j = 0;
        
        //sorted descending by value 
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b)-> Integer.compare(b[0], a[0]));


        while(j < nums.length){
           
            heap.offer(new int[]{nums[j],j});

            while(j-i+1 > k){
                i++;
            }


            if(j-i+1 == k){
                while(heap.peek()[1] < i){
                    heap.poll();
                }

                ans[idx++] = heap.peek()[0];
            }
            

            j++;
        }
         
        return ans;
    }
}
