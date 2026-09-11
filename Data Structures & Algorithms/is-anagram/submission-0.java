class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] nums = new int[26];

        for(char ch : s.toCharArray()){
            nums[ch - 'a'] ++;
        }
        
        for(char ch : t.toCharArray()){
            nums[ch - 'a'] --;
        }
        
        for(int num : nums){
           if(num != 0 ) return false;
        }
        
        return true;
    }
}
