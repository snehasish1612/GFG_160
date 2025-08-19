class LRUCache {
    
    class Node{
        int key, val;
        Node prev;
        Node next;
        
        Node(int key, int val){
            this.key = key;
            this.val = val;
            prev = null;
            next = null;
        }
    }
    
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    Map<Integer, Node> map;
    int limit;

    public void addNode(Node newNode){
        Node oldNext = head.next;
        
        head.next = newNode;
        oldNext.prev = newNode;
        newNode.next = oldNext;
        newNode.prev = head;
    }
    
    public void delNode(Node oldNode){
        Node oldPrev = oldNode.prev;
        Node oldNext = oldNode.next;
        
        oldPrev.next = oldNext;
        oldNext.prev = oldPrev;
    }

    LRUCache(int cap) {
        // code here
        limit = cap;
        map = new HashMap<>();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {

        
        //  code here
        if(!map.containsKey(key))
            return -1;
        
        Node ansNode = map.get(key);    
        int ans = ansNode.val;
        
        map.remove(key);
        delNode(ansNode);
        
        addNode(ansNode);
        map.put(key, ansNode);
        
        return ans;
    }

        
    public void put(int key, int value) {
        //  code here
        
        if(map.containsKey(key)){
            Node oldNode = map.get(key);
            delNode(oldNode);
            map.remove(key);
        }
        
        if(map.size() == limit){
            //delete LRU data
            map.remove(tail.prev.key);
            delNode(tail.prev);
        }
        
        Node newNode = new Node(key, value);
        addNode(newNode);
        
        map.put(key, newNode);
    }
}
