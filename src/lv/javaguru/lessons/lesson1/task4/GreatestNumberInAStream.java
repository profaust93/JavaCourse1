package lv.javaguru.lessons.lesson1.task4;

import java.util.Scanner;

public class GreatestNumberInAStream {

    public static void main(String[] args) {
        int maxNumber = getGreatestNumberInStream();
        printMaxNumber(maxNumber);
    }

    private static int getNumberFromUser() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    private static int getGreatestOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    private static void printMaxNumber(int maxNumber) {
        System.out.println("Max: " + maxNumber);
    }

    private static int getGreatestNumberInStream() {
        int number = getNumberFromUser();
        int maxNumber = number;
        while (true) {
            if (number == 0) {
                break;
            }
            maxNumber = getGreatestOfTwoNumbers(number, maxNumber);

            number = getNumberFromUser();
        }
        return maxNumber;
    }
}
