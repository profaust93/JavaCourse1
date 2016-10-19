package lv.javaguru.lessons.lesson1.task0;

import java.util.Scanner;

public class SimpleIfStatementUsage {

    public static void main(String[] args) {
        int numberFromUser = getNumberFromUser();
        printNumberSign(numberFromUser);
    }

    private static int getNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();
        return number;
    }

    private static void printNumberSign(int number) {
        if (number == 0) {
            System.out.println("This is zero");
        } else if (number > 0) {
            System.out.println("This is positive number");
        } else {
            System.out.println("This is negative number");
        }
    }


}
