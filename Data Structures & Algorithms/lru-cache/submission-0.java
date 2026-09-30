class LRUCache {

    Map<Integer,DLL> map;
    DLL head;
    DLL tail;
    int size;


    public LRUCache(int capacity) {

        this.map = new HashMap<>();
        this.head = new DLL(-2,-2);
        this.tail = new DLL(-1,-1);
        this.size = capacity;

        head.next = tail;
        tail.prev = head;

    }
    
    public int get(int key) {

        if(map.containsKey(key)){
           DLL node = map.get(key);
           addToFront(node);
           return node.val;
        }
        else return -1;

    }
    
    public void put(int key, int value) {
        
        if(map.containsKey(key)){
            DLL node = map.get(key);
            node.val = value;
            addToFront(node);
        }
        else{
           if(map.size() == size) remove();
           DLL newNode = new DLL(key,value);
           addToFront(newNode);
           map.put(key,newNode);
        }

        return;

    }

    public void addToFront(DLL node){

        DLL prev = node.prev;
        DLL nxt  = node.next;

        if(prev != null) prev.next = nxt;
        if(nxt != null) nxt.prev = prev;

        DLL temp = head.next;
        head.next = node;
        node.prev = head;
        node.next = temp;
        temp.prev = node;

    }

    public void remove(){
       
       DLL last = tail.prev;
       DLL prev = last.prev;
       DLL nxt = last.next;
       
       prev.next = nxt;
       nxt.prev = prev;

       last.next = null;
       last.prev = null;
       
       map.remove(last.key);
       
       return;
    }
}


class DLL{
   
   int key;
   int val;
   DLL next;
   DLL prev;

   public DLL(int k , int v){
     this.key = k;
     this.val = v;
     this.next = null;
     this.prev = null;
   }

}
