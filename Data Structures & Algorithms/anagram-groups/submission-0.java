class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,List<String>> agstore = new HashMap<>();

       for (String s : strs){
          
          char[] chars = s.toCharArray();
          Arrays.sort(chars);
          String sorted = new String(chars);
          
          agstore.putIfAbsent(sorted,new ArrayList<>());
          agstore.get(sorted).add(s);
 
       }
       
       return new ArrayList<>(agstore.values());
    }

}
