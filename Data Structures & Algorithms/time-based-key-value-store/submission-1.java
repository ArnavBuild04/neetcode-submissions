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
        
        List<Data> list = map.get(key);

        if(list == null) return "";

        int start = 0;
        int end = list.size() - 1;
        int ans = -1;

        while(start <= end){

            int mid = (start + end)/2;

            if(list.get(mid).ts <= timestamp){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return ans == -1 ? "" : list.get(ans).value;
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