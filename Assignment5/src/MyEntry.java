/*
 * Understand the principles of HashMap, 
 * read the source code of HashMap in Java library, 
 * then design and implement your own HashMap using array. 
 * It should at least support get, set, etc functions.
 */

public class MyEntry<K, V> {
  private final K key;
  private V value;

  public MyEntry(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }
} 