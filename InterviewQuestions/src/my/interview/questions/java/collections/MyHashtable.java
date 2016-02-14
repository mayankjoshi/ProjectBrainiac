package my.interview.questions.java.collections;

public class MyHashtable<K, V> {

	private final int DEFAULT_INIT_CAPACITY = 16;
	private final float DEFAULT_INT_LOADFACTOR = 0.75f;

	int size;
	TableEntry[] table;

	private class TableEntry<K, V> {
		K key;
		V value;
		int hash;
		TableEntry<K, V> next;

		public TableEntry(K key, V value, int hash, TableEntry next) {
			this.key = key;
			this.value = value;
			this.hash = hash;
			this.next = next;
		}

		K getKey() {
			return key;
		}

		V getValue() {
			return value;
		}

		V setValue(V value) {
			this.value = value;
			return value;
		}

	}

	public MyHashtable() {
		table = new TableEntry[DEFAULT_INIT_CAPACITY];

	}

	public MyHashtable(final int capacity) {
		table = new TableEntry[capacity];
	}

	public V put(K key, V value) {
		// if (key == null) {
		// return insertNullKey(value);
		// }

		int hash = key.hashCode();
		int index = hash % table.length;

		TableEntry<K, V> entry = table[index];
		if (entry == null) {
			table[index] = new TableEntry<K, V>(key, value, hash, null);
			return value;
		}
		if(hash==entry.hash){
			if(key.equals(entry.key)){
				table[index]= table[index] = new TableEntry<K, V>(key, value, hash, null);
				return value;
			}else{
				entry.next=new TableEntry<K, V>(key, value, hash, null);
				return value;
			}
		}

		return null;

	}

}
