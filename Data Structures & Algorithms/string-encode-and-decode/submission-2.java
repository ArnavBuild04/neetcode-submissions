class Solution {

    public String encode(List<String> strs) {
       
       String ans = "";
       
       for(int i = 0 ; i < strs.size() ; i++){
          char ch = (char)300;
          String temp = new String(strs.get(i).toCharArray());
          temp = temp + ch;
          ans = ans + temp;
       }
       
       return ans;
    }

    public List<String> decode(String str) {
       
       String s = "";
       List<String> ans = new ArrayList<>();

       for(int i = 0 ; i < str.length() ; i++){
           
           if(str.charAt(i)==(char)300){
              ans.add(s);
              s = "";
              continue;
           }
           s = s + str.charAt(i);
       }
       
       return ans;
    }
}
