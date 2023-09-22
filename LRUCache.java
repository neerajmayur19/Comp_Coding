class LRUCache {
    HashMap<Integer,LinkedList> map = new HashMap<>();
    LinkedList head = new LinkedList(0,0);
    LinkedList tail = new LinkedList(0,0);
    int capacity;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            LinkedList node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else
        {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            remove(map.get(key));
        }
        if(map.size()==capacity)
        {
            remove(tail.prev);
        }
        insert(new LinkedList(key,value));
    }
    private void remove(LinkedList node)
    {
        map.remove(node.key);
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
    private void insert(LinkedList node)
    {
        map.put(node.key,node);
        LinkedList next_head = head.next;
        head.next = node;
        node.prev = head;
        node.next = next_head;
        next_head.prev = node;
    }
    class LinkedList
    {
        LinkedList prev;
        LinkedList next;
        int key,value;
        LinkedList(int k,int v)
        {
            this.key = k;
            this.value = v;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
