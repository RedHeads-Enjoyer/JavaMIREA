package com.company.Ex2;

public interface Queue<E> {
    E element();  //Возвращает пеовый элемент очереди
    boolean push(E elem);
    E pop(); //Возвращает первый элемент с удалением
    int size();
    boolean isEmpty();

}
