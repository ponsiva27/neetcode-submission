class MyHashSet {

    private int ARRAY_SIZE = 10000;

    private LinkedList<Integer> [] buckets;

    public MyHashSet() {
        buckets = new LinkedList[ARRAY_SIZE];    
    }

    public int hash(int key) {
        return key%ARRAY_SIZE;
    }
    
    public void add(int key) {
        int index = hash(key);

        if(buckets[index]==null) {
            buckets[index] = new LinkedList<>();
        }

        if(!buckets[index].contains(key)) {
             buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index = hash(key);

       LinkedList<Integer> bucket = buckets[index];   

       if(bucket!=null) {
            bucket.remove(Integer.valueOf(key));
       }
    }
    
    public boolean contains(int key) {
        
        int index = hash(key);
        LinkedList<Integer> bucket = buckets[index];

        if(bucket!=null) {
            return bucket.contains(key);
        }   
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */