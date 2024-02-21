/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputnum;

import java.util.Scanner;

public class inputNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input amount of numbers to put in a list: ");
        int numberAmount = input.nextInt();

        // Validate that the number of elements is positive
        while (numberAmount <= 0) {
            System.out.println("Number of elements must be positive. Please input again.");
            System.out.print("Input amount of numbers to put in a list: ");
            numberAmount = input.nextInt();
        }

        int[] numbers = new int[numberAmount];

        System.out.println("Input numbers: ");
        for (int i = 0; i < numberAmount; i++) {
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = input.nextInt();
                if (numbers[i] >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a non-negative number.");
                }
            }
        }

        System.out.print("Output numbers: [");
        for (int i = 0; i < numberAmount; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(numbers[i]);
        }
        System.out.println("]");
        input.close();
    }
}
