class Solution {
    public boolean isAnagram(String s, String t) {

       int[] dix = new int[26];

       for(char ch : s.toCharArray()){
          dix[ch-'a']++;
       }

       for(char ch : t.toCharArray()){
          dix[ch-'a']--;
       }

       for(int i = 0 ; i < dix.length ; i++){
          if(dix[i] != 0) return false;
       }
       
       return true;
    } 
}
