package lv.javaguru.lessons.lesson1.task6;

import java.util.Random;
import java.util.Scanner;

public class UserGuessesANumber {

    public static void main(String[] args) {
        int randomNumber = getRandomNumber();
        while (true){
            int userNumber = getNumberFromUser();
            int answer = compareNumbers(randomNumber,userNumber);
            printAnswer(answer);
            if(answer == 0){
                break;
            }
        }
    }

    private static int getNumberFromUser() {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }


    private static int compareNumbers(int randomNumber, int userNumber){
        if(randomNumber > userNumber){
            return 1;
        } else if( randomNumber < userNumber){
            return -1;
        } else {
            return 0;
        }
    }

    private static int getRandomNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }

    private static void printAnswer(int answer){
        switch (answer){
            case 0:
                System.out.println("Luck!");
                break;
            case 1:
                System.out.println("Guessed number is greater!");
                break;
            case -1:
                System.out.println("Guessed number is lower!");
                break;
        }
    }

}
