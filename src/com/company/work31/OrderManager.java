package com.company.work31;

public class OrderManager {
    private Order[] orders = new Order[10];

    public void add(Order order, int tableNumber){
        assert tableNumber<=10 && tableNumber>0;
        orders[tableNumber-1] = order;
    }

    public Order getOrder(int tableNumber){
        assert tableNumber<=10 && tableNumber>0;
        return orders[tableNumber-1];
    }

    public void addDish(Dish dish, int tableNumber){
        assert tableNumber<=10 && tableNumber>0;
        if (orders[tableNumber-1]!=null){
            orders[tableNumber-1].add(dish);
        }else{
            Order order = new Order();
            order.add(dish);
            orders[tableNumber-1] = order;
        }
    }

    public void removeOrder(int tableNumber){
        assert tableNumber<=10 && tableNumber>0;
        orders[tableNumber-1] = null;
    }

    public int freeTableNumber(){
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null){
                return i+1;
            }
        }
        return -1;
    }

    public int[] freeTableNumbers(){
        int numberOf = 0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null){
                numberOf++;
            }
        }
        int[] tableNumbers = new int[numberOf];
        numberOf=0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]==null){
                tableNumbers[numberOf] = i+1;
            }
        }
        return tableNumbers;
    }

    public Order[] getOrders(){
        return orders;
    }

    public double ordersCostSummary(){
        double cost = 0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]!=null){
                for (Dish item: orders[i].getDishes()){
                    cost+=item.getCost();
                }
            }
        }
        return cost;
    }

    public int dishQuantity(String dishName){
        int numberOf=0;
        for (int i=0; i<orders.length; i++){
            if (orders[i]!=null){
                for (Dish item: orders[i].getDishes()){
                    if (item.getName() == dishName){
                        numberOf++;
                    }
                }
            }
        }
        return numberOf;
    }

}
