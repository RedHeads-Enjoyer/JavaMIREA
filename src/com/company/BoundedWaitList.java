package com.company;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return Возвращает максимальынй размер очереди
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param element Добавляет переданный элемент в очередь
     */
    @Override
    public void add(E element) {
        if (concurrentLinkedQueue.size() < capacity)
        concurrentLinkedQueue.add(element);
    }

    /**
     * @return Элементы очереди в виде строки
     */
    public String toString() {
        return concurrentLinkedQueue.toString();
    }
}
