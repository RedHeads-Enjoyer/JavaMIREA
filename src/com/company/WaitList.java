package com.company;

import java.util.Collection;

public class WaitList<E> implements IWaitList<E>{

    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public WaitList(){};

    public WaitList(Collection<E> c){};

    public String toString() {return "";};
}
