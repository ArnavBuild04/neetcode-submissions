class Solution {

    public String encode(List<String> strs) {
       
       char key = (char) 350;
       String s = "";

       for(String str : strs){
          s = s + str + key;
       }
       
       return s;
    }

    public List<String> decode(String str) {

        List<String> ans = new ArrayList<>();
        String temp = "";

        for(int i = 0 ; i < str.length() ; i++){      
            
            if(str.charAt(i) == 350){
                ans.add(temp);
                temp = "";
            }
            else temp = temp + str.charAt(i);

        }
        
        return ans;
    }
}
