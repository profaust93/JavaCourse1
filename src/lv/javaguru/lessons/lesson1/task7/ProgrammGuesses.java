package lv.javaguru.lessons.lesson1.task7;

import java.util.Scanner;

public class ProgrammGuesses {

    public static void main(String[] args) {
        int max = 100;
        int min = 0;
        boolean isBreak = false;
        while (true) {
            int guessedNumber = getGuessedNumber(min, max);
            printGuessedNumber(guessedNumber);
            String answer = getStringFromUser();
            switch (answer) {
                case ">":
                    min = guessedNumber;
                    break;
                case "<":
                    max = guessedNumber;
                    break;
                case "=":
                    isBreak = true;
            }
            if (isBreak) {
                break;
            }
        }

    }

    private static String getStringFromUser() {
        Scanner sc = new Scanner(System.in);
        String userString = sc.nextLine();
        return userString;
    }

    private static int getGuessedNumber(int min, int max) {
        int answerNumber = (max + min) / 2;
        return answerNumber;
    }

    private static void printGuessedNumber(int number) {
        System.out.println(number + " ?");
    }

}
