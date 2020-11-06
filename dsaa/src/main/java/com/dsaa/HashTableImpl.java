package com.dsaa;

public class HashTableImpl {

	private static int INITIAL_SIZE = 16;
	private HashEntry[] entries = new HashEntry[INITIAL_SIZE];

	public void put(String key, String value) {
		int hash = getHash(key);
		final HashEntry hashEntry = new HashEntry(key, value);
		if (entries[hash] == null) {
			entries[hash] = hashEntry;
		}
		// If there is already an entry at current hash
		// position, add entry to the linked list.
		else {
			HashEntry temp = entries[hash];
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = hashEntry;
		}
	}

	/**
	 * Returns 'null' if the element is not found.
	 */
	public String get(String key) {
		int hash = getHash(key);
		if (entries[hash] != null) {
			HashEntry temp = entries[hash];

			// Check the entry linked list for march
			// for the given 'key'
			while (!temp.key.equals(key) && temp.next != null) {
				temp = temp.next;
			}
			return temp.value;
		}

		return null;
	}

	private int getHash(String key) {
		// piggy backing on java string
		// hashcode implementation.
		return key.hashCode() % INITIAL_SIZE;
	}

	public static class HashEntry {
		String key;
		String value;
		// Linked list of same hash entries.
		HashEntry next;

		public HashEntry(String key, String value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}

		@Override
		public String toString() {
			return "[" + key + ", " + value + "]";
		}
	}

	@Override
	public String toString() {
		int bucket = 0;
		StringBuilder hashTableStr = new StringBuilder();
		for (HashEntry entry : entries) {
			if (entry == null) {
				continue;
			}
			hashTableStr.append("\n bucket[").append(bucket).append("] = ").append(entry.toString());
			bucket++;
			HashEntry temp = entry.next;
			while (temp != null) {
				hashTableStr.append(" -> ");
				hashTableStr.append(temp.toString());
				temp = temp.next;
			}
		}
		return hashTableStr.toString();
	}

	public static void main(String[] args) {
		HashTableImpl hashTable = new HashTableImpl();
		// Put some key values.
		for (int i = 0; i < 30; i++) {
			final String key = String.valueOf(i);
			hashTable.put(key, key);
		}

		// Print the HashTable structure
		log("****   HashTable  ***");
		log(hashTable.toString());
		log("\nValue for key(20) : " + hashTable.get("20"));
	}

	private static void log(String msg) {
		System.out.println(msg);
	}

}
