class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet<>();
        int ans = 0; 

        while( j < s.length() ){
           
           char ch = s.charAt(j);
           
           while(set.contains(ch)){
               set.remove(s.charAt(i));
               i++;
           }
           set.add(ch);
           
           if( set.size() == j-i+1 ){
              ans = Math.max(ans,j-i+1);
           }

           j++;

        }

        return ans;
    }
}
