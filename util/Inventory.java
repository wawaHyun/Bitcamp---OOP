<<<<<<< HEAD
package util;

import java.util.*;

public class Inventory<T> {
    private ArrayList<T> inventoryList;

    public Inventory(ArrayList<T> inventoryList) {
        this.inventoryList = new ArrayList<>();
    }

    public void add(T t) {
        inventoryList.add(t);
    }
    public T remove(int i) {
        return inventoryList.remove(i);
    }
    public boolean contains(T t) {
        return inventoryList.contains(t);
    }
    public T get(int i) {
        return inventoryList.get(i);
    }
    public void clear() {
        inventoryList.clear();
    }
}
=======
package util;

import java.util.*;

public class Inventory<T> {
    private ArrayList<T> inventoryList;

    public Inventory(ArrayList<T> inventoryList) {
        this.inventoryList = new ArrayList<>();
    }

    public void add(T t) {
        inventoryList.add(t);
    }
    public T remove(int i) {
        return inventoryList.remove(i);
    }
    public boolean contains(T t) {
        return inventoryList.contains(t);
    }
    public T get(int i) {
        return inventoryList.get(i);
    }
    public void clear() {
        inventoryList.clear();
    }
}
>>>>>>> 504fa6313cba374b40307599a88c30eca5b3cde7
