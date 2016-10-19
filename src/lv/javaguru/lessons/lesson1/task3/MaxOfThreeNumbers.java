package lv.javaguru.lessons.lesson1.task3;

import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        int firstNumber = getNumberFromUser();
        int secondNumber = getNumberFromUser();
        int thirdNumber = getNumberFromUser();
        int greatestNumber = getGreatestNumber(firstNumber, secondNumber, thirdNumber);
        print(greatestNumber);
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        return number;
    }

    private static int getGreatestNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int greatestNumber = getGreatestNumber(firstNumber, secondNumber);
        greatestNumber = getGreatestNumber(greatestNumber, thirdNumber);
        return greatestNumber;
    }

    private static int getGreatestNumber(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    private static void print(int number) {
        System.out.println("Answer: " + number);
    }
}
