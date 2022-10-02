package com.company;

public class TablesOrderManager {
    private Order[] orders;
    private int capacity;
    private int size = 0;

    public TablesOrderManager(int capacity) {
        this.capacity = capacity;
        orders = new Order[capacity];
    }

    public void add(Order order){
        if (size == capacity - 1){
            capacity *= 2;
            copy(capacity);
        }
        orders[size] = order;
        size+=1;
    }

    public Order get(int index) {
        try {
            return orders[index];
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Out of bounds");
        }
        return null;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    private void copy(int newCapacity){
        Order[] newOrders = new Order[newCapacity];
        for (int i=0; i<size; i++){
            newOrders[i] = tableOrders[i];
        }
        tableOrders = newOrders;
    }
}
