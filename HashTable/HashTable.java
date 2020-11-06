import java.util.ArrayList;

class HashTable<K, V> {
    ArrayList<ArrayList<HashEntry<K, V>>> hashMap;
    int size;
    
    class HashEntry<K, V> { 
        K key; 
        V value; 
        HashEntry<K, V> next; 
    
        public HashEntry(K key, V value) 
        { 
            this.key = key; 
            this.value = value; 
        } 
        public String toString() {
            return key.toString() + "=" + value.toString();
        }
    } 
    
    public HashTable(int size) {
        this.size = size;
        hashMap = new ArrayList<>(size);
        
        for(int i=0; i < size; i++) {
            hashMap.add(i, new ArrayList<HashEntry<K, V>>());
        }
    }

    public int getHashIndex(K key) {
        return key.hashCode() % size;
    }

    public void put(K key, V value) {
        int idx = getHashIndex(key);	
        ArrayList<HashEntry<K, V>> entryList = hashMap.get(idx);
        HashEntry<K, V> newEntry = new HashEntry<K, V>(key, value);
        boolean isFound = false;
        
        for (HashEntry<K, V> entry : entryList) {
            if (entry.key.equals(newEntry.key)) {
                isFound = true;
                entry.value = newEntry.value;
            }
        }
        
        if (!isFound) {
            entryList.add(newEntry);
        }
    }

    public V get(K key) {
        int idx = getHashIndex(key);
        ArrayList<HashEntry<K, V>> entryList = hashMap.get(idx);
        
        for (HashEntry<K, V> entry : entryList) {
            if(entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }
}

