class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i = 0 ; i < strs.length ; i++){

            String s = strs[i];
            char[] charArr = new char[s.length()];

            for(int j = 0 ; j < s.length() ; j++){
                charArr[j] = s.charAt(j);
            }

            Arrays.sort(charArr);
            String key = new String(charArr);
            List<String> val;

            if(map.containsKey(key)) {
                val = map.get(key);
            }
            else val = new ArrayList<>();
            
            val.add(s);
            map.put(key,val);
        }


        for(Map.Entry<String,List<String>> x : map.entrySet()){
            
            List<String> temp = new ArrayList<>();
            for(String s : x.getValue()){
                temp.add(s);
            }
            ans.add(temp);
        }

        return ans;
    }
}
