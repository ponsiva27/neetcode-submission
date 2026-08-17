class MyHashMap {

    private int ARRAY_SIZE = 10000;

    // The folder now holds arrays of two integers: [key, value]
    private LinkedList<int[]>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[ARRAY_SIZE];    
    }

    private int hash(int key) {
        return key % ARRAY_SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);

        // If the slot is empty, build a new folder
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        LinkedList<int[]> bucket = buckets[index];
        
        // Flip through the folder looking for an existing sticky note
        for (int[] stickyNote : bucket) {
            if (stickyNote[0] == key) {
                stickyNote[1] = value; // Update the amount!
                return; // We are done, exit the method.
            }
        }
        
        // If we didn't find it, staple a new sticky note to the back
        bucket.add(new int[]{key, value});
    }

    public int get(int key) {
        int index = hash(key);
        LinkedList<int[]> bucket = buckets[index];

        // If no folder exists, the key is definitely not here
        if (bucket == null) {
            return -1;
        }

        // Flip through the folder looking for the sticky note
        for (int[] stickyNote : bucket) {
            if (stickyNote[0] == key) {
                return stickyNote[1]; // Found it! Return the amount.
            }
        }
        
        // Flipped through the whole folder and didn't find it
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        LinkedList<int[]> bucket = buckets[index];

        if (bucket == null) {
            return;
        }

        // Flip through looking for the sticky note to remove
        for (int[] stickyNote : bucket) {
            if (stickyNote[0] == key) {
                bucket.remove(stickyNote); // Rip it out!
                return;
            }
        }
    }
}