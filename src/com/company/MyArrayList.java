package com.company;

import java.util.AbstractList;

public class MyArrayList<T> {
    private int pointer = 0;
    private Object[] array = new Object[16];

    public void add(Object item) {
        if (pointer == array.length - 1) {
            resize(array.length * 2);
        }
        array[pointer++] = item;
    }

    private void resize(int capacity) {
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    public void remove(int index) {
        for (int i = index; i < pointer; i++) {
            array[i] = array[i + 1];
        }
        array[pointer] = null;
        pointer--;
        if (array.length / 2 < pointer) {
            resize(array.length / 2);
        }
    }

    public Object get(int index) {
        return (T) array[index];
    }

    public int size() {
        return pointer;
    }
}
