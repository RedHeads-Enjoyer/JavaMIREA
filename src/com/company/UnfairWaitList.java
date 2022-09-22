package com.company;

import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList {
    public UnfairWaitList() {
    }

    /**
     * @param element Удаляет переданный элемент
     */
    public void remove(E element) {
        concurrentLinkedQueue.remove(element);
    }

    /**
     * @param element Ставит переданный элемент в конец очереди
     */
    public void moveToBack(E element) {
        ConcurrentLinkedQueue<E> temp = new ConcurrentLinkedQueue<E>();
        temp.add(element);
        temp.addAll(concurrentLinkedQueue);
        concurrentLinkedQueue.removeAll(concurrentLinkedQueue);
        concurrentLinkedQueue.addAll(temp);
    }
}
