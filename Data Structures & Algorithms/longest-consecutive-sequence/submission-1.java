class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int ans = 0;

        for(int num : nums){
            set.add(num);
        } 

        for(int num : set){

            int count = 1;
            if(!set.contains(num - 1)){
                
                int temp = num + 1;
                while(set.contains(temp)){
                    count++;
                    temp++;
                }
                
                ans = Math.max(ans,count);
            }
        } 
        
        return ans;
    }
}
