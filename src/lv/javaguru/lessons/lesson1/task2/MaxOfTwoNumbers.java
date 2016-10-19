package lv.javaguru.lessons.lesson1.task2;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int firstNumber = getNumberFromUser();
            int secondNumber = getNumberFromUser();
            int greatestNumber = getGreatestNumber(firstNumber, secondNumber);
            print(greatestNumber);
            System.out.println("Do you want to continue? 1 - yes 0 - no");
            int answerNumber = sc.nextInt();
            if(answerNumber == 0){
                break;
            }
        }
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        return number;
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
