package com.company.work31;

public class Main {

    public static void main(String[] args) {
	    Order order = new Order();
        order.add(new Dish(
                435,"ifdifd","piipve"
        ));
        order.add(new Dish(
                4335,"ifdifd","piipve"
        ));
        order.add(new Dish(
                434355,"ifdifd","piipve"
        ));
        Dish[] dishes = order.sortedDishesByCostDesc();
        for (int i =0; i<dishes.length; i++){
            System.out.println(dishes[i].getCost());
        }
    }
}
