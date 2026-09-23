class TimeMap {

    Map<String,List<Data>> map;

    public TimeMap() {
        this.map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        
        Data data = new Data(value,timestamp);
        map.computeIfAbsent(key,k -> new ArrayList<>()).add(data);
        return;
    }
    
    public String get(String key, int timestamp) {
        
        if(map.get(key) == null) return "";

        List<Data> temp = map.get(key);
        int ans = -1;

        for(int i = 0 ; i < temp.size() ; i++){
            if(ans < temp.get(i).ts && temp.get(i).ts <= timestamp){
                ans = i;
            }
        }

        return ans == -1 ? "" : temp.get(ans).value;

    }
}


class Data {
    
    String value;
    Integer ts;

    public Data(String v , int t){
        this.value = v;
        this.ts = t;
    }

}