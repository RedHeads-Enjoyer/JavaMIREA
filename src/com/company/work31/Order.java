package com.company.work31;

import com.company.work31.Dish;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    private int size;
    private Dish[] dishes = new Dish[0];

    public Order() {
        newCap(2);
    }

    public Order(int capacity) {
        dishes = new Dish[capacity];
    }

    private void newCap(int capacity){
        if (size==dishes.length){
            dishes = Arrays.copyOf(dishes, capacity*2);
        }
    }

    public boolean add(Dish dish){
        if (dish == null){
            return false;
        }
        newCap(size);
        dishes[size++] = dish;
        return true;
    }

    public boolean remove(String dishName){
        for (int i=0; i<size; i++){
            if (dishes[i].getName() == dishName){
                for (int j=i; j<size-1; j++){
                    dishes[j] = dishes[j-1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName){
        int numberOf = 0;
        for (int i=0; i<size;){
            if (dishes[i].getName() == dishName){
                for (int j=i; j<size-1; j++){
                    dishes[j] = dishes[j-1];
                }
                size--;
                numberOf++;
            }else{
                i++;
            }
        }
        return numberOf;
    }

    public int dishQuantity(){
        return size;
    }

    public int dishQuantity(String dishName){
        int numberOf = 0;
        for (int i=0; i<size; i++){
            if (dishes[i].getName() == dishName) numberOf++;
        }
        return numberOf;
    }

    public Dish[] getDishes() {
        Dish[] dish1 = new Dish[size];
        for (int i=0; i<size; i++){
            dish1[i] = dishes[i];
        }
        return dish1;
    }

    public double costTotal(){
        double cost = 0;
        for (int i=0; i<size; i++){
            cost += dishes[i].getCost();
        }
        return cost;
    }

    public  String[] dishesNames(){
        String[] names = new String[size];
        for (int i =0; i<size; i++){
            names[i] = dishes[i].getName();
        }
        return names;
    }

    public Dish[] sortedDishesByCostDesc(){
        Dish[] newDishes = new Dish[size];
        for (int i=0; i<size; i++){
            newDishes[i] = dishes[i];
        }
        Arrays.sort(newDishes, new Comparator<Dish>() {
            @Override
            public int compare(Dish o1, Dish o2) {
                return (int)(o2.getCost()-o1.getCost());
            }
        });
        return newDishes;
    }
}
