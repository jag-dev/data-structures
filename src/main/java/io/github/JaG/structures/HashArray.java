package io.github.JaG.structures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashArray<E, Object> {
    private HashMap<E, Object> data;
    private ArrayList<E> indexHolder;

    public HashArray() {
        data = new HashMap<>();
        indexHolder = new ArrayList<>();
    }
    /*
     * Use .put() to insert data into the HashArray
     * @param key to access data with, value that is the data
     * @return void
     */
    public void put(E key, Object value) {
        indexHolder.add(key);
        data.put(key, value);
    }
    /*
     * Use .insert() to put a list of keys into the HashArray with the same value
     * @param List<E> list of keys to add, Object value to assign to all
     * @return void
     */
    public void insert(List<E> keys, Object value) {
        for (E key : keys) {
            data.put(key, value);
            indexHolder.add(key);
        }
    }
    /*
     * Use getValue() to return a value either an an int index, or by key
     * @param key to access data, isIndex determines if you are accessing integer key or getting index
     * @throws NullPointerException if isIndex is true without proper index given
     * @return Object at key or index
     */
    public Object get(E key, boolean isIndex) {
        if (isIndex) {
            if (key instanceof Integer) { return data.get(indexHolder.get((Integer)key)); }
            else { throw new NullPointerException("isIndex means you are getting an integer value"); }
        }
        return data.get(key);
    }
    /*
     * Use remove() to fully remove a key from the HashArray
     * @param key to remove
     * @return void
     */
    public void remove(E key) {
        data.remove(key);
        indexHolder.remove(key);
    }
    /*
     * Use .contains() to check if the HashArray contains a key
     * @param key to check for
     * @return true for yes, false for no
     */
    public boolean contains(E key) { return indexHolder.contains(key); }
    /*
     * Use .clear() to clear the HashArray
     * @param none
     * @return void
     */
    public void clear() {
        data.clear();
        indexHolder.clear();
    }
    /*
     * Use getIndex() to get the current index of the HashArray
     * @param key to get index of
     * @return int index
     */
    public int getIndex(E key) { return indexHolder.indexOf(data.get(key)); }
    /*
     * Use getSize() to get current size of HashArray
     * @param none
     * @return int size of HashArray
     */
    public int getSize() { return indexHolder.size(); }
    /*
     * Use keyList() to get an ArrayList of they current keys
     * @param none
     * @return ArrayList<E> of all keys in HashMap
     */
    public ArrayList<E> keyList() { return indexHolder; }
}
