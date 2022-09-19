package com.company;

import javax.swing.*;
import java.util.Scanner;
import java.util.Stack;

public class StackSolution {
    private void game(Stack<Integer> player1, Stack<Integer> player2){
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        int iteration = 0;
        boolean finish = false;

        for (int i = 0; i < 106; i++) {
            iteration++;
            int card1 = player1.pop();
            int card2 = player2.pop();

            if ((card1 > card2 && card2 != 0 && card1 != 9) || (card1 == 0 && card2 == 9)) {
                stack1.push(card1);
                stack1.push(card2);
            }
            else if ((card2 > card1 && card1 != 0 && card2 != 9) || (card2 == 0 && card1 == 9)) {
                stack2.push(card1);
                stack2.push(card2);
            }

            if (player1.size() == 0 && player2.size() != 0) {
                while (stack1.size() > 0) {
                    player1.push(stack1.pop());
                }
            }

            if (player2.size() == 0 && player1.size() != 0) {
                while (stack2.size() > 0) {
                    player2.push(stack2.pop());
                }
            }

            if (player1.size() == 0) {
                System.out.println("second " + iteration);
                finish = true;
                break;
            }

            if (player2.size() == 0) {
                System.out.println("first " + iteration);
                finish = true;
                break;
            }
        }
        if (!finish) System.out.println("botva");
    }

    public void test() {
        int[] player1 = new int[5];
        int[] player2 = new int[5];
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            player1[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            player2[i] = scanner.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            stack1.push(player1[i]);
            stack2.push(player2[i]);
        }

        game(stack1, stack2);
    }
}
