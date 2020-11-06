class HashTableMain {
    public static void main(String[] args) {
        HashTable<Integer, String> ht = new HashTable<>(4);
        ht.put(0, "Hello");
        ht.put(1, "Moon");
        ht.put(2, "cas");
        ht.put(3, "las");
        System.out.println(ht.size);
        for (int i = 0; i < ht.size; i++) {
            System.out.println(ht.get(i));
        }
    }
}