package lv.javaguru.lessons.lesson1.task1;

import java.util.Locale;
import java.util.Scanner;

public class SimpleArithmetic {

    public static void main(String[] args) {
        double firstNumber = getNumberFromUser();
        double secondNumber = getNumberFromUser();
        double thirdNumber = getNumberFromUser();
        double averageNumber = calculateAvg(firstNumber, secondNumber, thirdNumber);
        print(averageNumber);

    }

    private static double getNumberFromUser() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double number = sc.nextDouble();
        return number;
    }

    private static double calculateAvg(double firstNumber, double secondNumber, double thirdNumber) {
        double sum = firstNumber + secondNumber + thirdNumber;
        double avgNumber = sum / 3;
        return avgNumber;
    }

    private static void print(double number) {
        System.out.println("Answer: " + number);
    }
}
