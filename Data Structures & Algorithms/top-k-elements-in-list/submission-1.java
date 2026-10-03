class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a,b) -> a[1] - b[1]);

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            int[] temp = new int[]{x.getKey(),x.getValue()};
            pq.add(temp);
            if(pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        int idx = 0;

        while(!pq.isEmpty()){
            ans[idx++] = pq.poll()[0];
        }
        
        return ans;
    }
}
