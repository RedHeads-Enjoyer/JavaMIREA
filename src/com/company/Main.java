package com.company;

public class Main {

    public static void main(String[] args) {
        BoundedWaitList<Integer> boundedWaitList = new BoundedWaitList<Integer>(3);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(67);
        boundedWaitList.add(0);
        if (boundedWaitList.contains(1)) System.out.println("1");;
        System.out.println(boundedWaitList.toString());

        UnfairWaitList<Integer> unfairWaitList = new UnfairWaitList<Integer>();
        unfairWaitList.add(1);
        unfairWaitList.add(2);
        unfairWaitList.add(67);
        unfairWaitList.add(0);
        unfairWaitList.moveToBack(-1);
        System.out.println(unfairWaitList.toString());
        unfairWaitList.remove(67);
        System.out.println(unfairWaitList.toString());
    }
}
