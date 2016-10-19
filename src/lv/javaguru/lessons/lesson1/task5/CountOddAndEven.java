package lv.javaguru.lessons.lesson1.task5;

import java.util.Scanner;

public class CountOddAndEven {

    public static void main(String[] args) {
        int oddCounter = 0;
        int evenCounter = 0;

        while (true) {
            int number = getNumberFromUser();
            if (number == 0) {
                break;
            }
            if (isEven(number)) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        printCounters(oddCounter, evenCounter);

    }

    private static int getNumberFromUser() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printCounters(int oddCounter, int evenCounter) {
        System.out.println("Even count: " + evenCounter);
        System.out.println("Odd count: " + oddCounter);
    }
}
