class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        int i = 0;
        int j = 0;

        int[] s1_freq = new int[26];
        int[] s2_freq = new int[26];

        for(char ch : s1.toCharArray()){
            s1_freq[ch-'a']++;
        }

        while(j < s2.length()){
           
           s2_freq[s2.charAt(j)-'a']++;

           while(j-i+1 > k){
             s2_freq[s2.charAt(i)-'a']--;
             i++;
           }
           
           Boolean isValid = true;
           for(int m = 0 ; m < 26 ; m++){
              if(s1_freq[m] != s2_freq[m]) {
                  isValid = false;
                  break;
              }
           }
           
           if(isValid) return true;

           j++;
        }

        return false;
    }
}
