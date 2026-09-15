class Solution {
    public int characterReplacement(String s, int k) {
        
        int i = 0;
        int j = 0;
        int ans = 1;
        int[] dix = new int[26];
        int maxF = 1;

        while(j < s.length()){
           
           char ch = s.charAt(j);
           dix[ch-'A']++;
           
           if(dix[ch-'A'] > maxF) maxF = dix[ch-'A'];
           
           while((j-i+1) - maxF > k){

             dix[s.charAt(i)-'A']--;
             i++;

           }

           ans = Math.max(ans,j-i+1);

           j++;
        }

      
       return ans;

    }
}
