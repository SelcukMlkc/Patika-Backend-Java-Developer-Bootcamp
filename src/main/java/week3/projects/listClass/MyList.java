package week3.projects.listClass;

import java.util.Arrays;

public class MyList<T> {
    private T[] array;
    private int size = 0;
    private int capacity;

    // Default constructor with initial capacity 10
    public MyList() {
        capacity = 10;
        array = createGenericArray(capacity);
    }

    // Constructor with user-defined capacity
    public MyList(int capacity) {
        this.capacity = capacity;
        array = createGenericArray(capacity);
    }

    // Helper method to create a generic array
    private T[] createGenericArray(int capacity) {
        return (T[]) new Object[capacity]; // Unchecked cast
    }

    // Returns number of elements in the list
    public int size() {
        return size;
    }

    // Returns the current capacity of the list
    public int getCapacity() {
        return capacity;
    }

    // Doubles the capacity and copies old elements to the new array
    private void resize() {
        capacity *= 2;
        array = Arrays.copyOf(array, capacity);
    }

    // Adds an element to the list
    public void add(T data) {
        if (size >= capacity) {
            resize();
        }
        array[size++] = data;
    }

    // Returns the element at the specified index
    public T get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return null;
    }

    // Removes the element at the specified index
    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[--size] = null;
        }
    }

    // Sets a new value at the specified index
    public void set(int index, T data) {
        if (index >= 0 && index < size) {
            array[index] = data;
        }
    }

    // Checks if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Returns the index of the first occurrence of the given data
    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) return i;
        }
        return -1;
    }

    // Returns the index of the last occurrence of the given data
    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) return i;
        }
        return -1;
    }

    // Converts list to Object array
    public Object[] toArray() {
        return Arrays.copyOf(array, size);
    }

    // Returns a new list containing elements from start to end index
    public MyList<T> subList(int start, int end) {
        MyList<T> sub = new MyList<>();
        for (int i = start; i < end; i++) {
            sub.add(array[i]);
        }
        return sub;
    }

    // Checks whether the list contains the given data
    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    // Clears the list and resets capacity to 10
    public void clear() {
        array = createGenericArray(10);
        size = 0;
        capacity = 10;
    }

    // Prints the list in a readable format
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(array[i]).append(", ");
        }
        sb.append(array[size - 1]).append("]");
        return sb.toString();
    }
}
