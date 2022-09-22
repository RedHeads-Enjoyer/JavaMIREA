package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>{

    protected ConcurrentLinkedQueue<E> concurrentLinkedQueue = new ConcurrentLinkedQueue<E>();

    /**
     * @param element Добавляет переданный элемент в очередь
     */
    @Override
    public void add(E element) {
        concurrentLinkedQueue.add(element);
    }

    @Override
    public E remove() {
        return null;
    }

    /**
     * @param element Возвращает наличие элемента в очереди
     * @return true/false
     */
    @Override
    public boolean contains(E element) {
        return concurrentLinkedQueue.contains(element);
    }

    /**
     * @param c Возвращает наличие элементов в очереди
     * @returnt rue/false
     */
    @Override
    public boolean containsAll(Collection<E> c) {
        return concurrentLinkedQueue.containsAll(c);
    }

    /**
     * @return true - очередь пуста, иначе - false
     */
    @Override
    public boolean isEmpty() {
        return concurrentLinkedQueue.isEmpty();
    }

    public WaitList(){};

    public WaitList(Collection<E> c){
        this.concurrentLinkedQueue.addAll(c);
    };

    /**
     * @return Элементы очереди в виде строки
     */
    public String toString() {return concurrentLinkedQueue.toString();};
}
