package com.company;




public class InternetOrder<Item> {

    private class Node {
        private Node next;
        private Node prev;
        private Item value;

        Node(Node next, Node prev, Item value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

        Node(Item value) {
            this(null, null, value);
        }
    }

    private Node first;
    private Node last;
    private int size;

    public boolean add(Item item) {
        if (first == null) {
            first = new Node(item);
            first.prev = first.next = first;
            last = first;
        }
        else {
            Node node = new Node(first, last, item);
            last.next = first.prev = node;
            first = node;
        }
        size++;
        return true;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Item removeFirst() {
        Item oldElement;
        if (this.size == 1) {
            oldElement = this.first.value;
        } else {
            oldElement = this.first.value;
            Node newFirst = this.first.next;
            newFirst.prev = this.last;
            this.last.next = newFirst;
            this.first = newFirst;
            this.size--;
        }
        return oldElement;
    }

    public Item removeLast() {
        Item oldElement;
        if (this.size == 1) {
            oldElement = this.first.value;
        } else {
            oldElement = this.last.value;
            Node newLast = this.last.prev;
            newLast.next = this.first;
            this.first.prev = newLast;
            this.last = newLast;
            this.size--;
        }
        return oldElement;
    }

    public boolean remove(Item item) {
        boolean result = false;
        if (item != null) {
            if (!isEmpty()) {
                if (this.first.value.equals(item)) {
                    removeFirst();
                    result = true;
                } else {
                    Node delete = null;
                    for (Node node = this.first.next; node != this.first; node = node.next) {
                        if (node.value.equals(item)) {
                            delete = node;
                        }
                    }
                    if (delete != null) {
                        if (delete == this.last) {
                            removeLast();
                            result = true;
                        } else {
                            delete.prev.next = delete.next;
                            delete.next.prev = delete.prev;
                            this.size--;
                            result = true;
                        }
                    }
                }
            }
        }
        return result;
    }

    public boolean contains(Item item) {
        return indexOf(item) != -1;
    }

    InternetOrder() {}

    InternetOrder(Item[] items) {
        for (Item item : items) {
            add(item);
        }
    }


}
