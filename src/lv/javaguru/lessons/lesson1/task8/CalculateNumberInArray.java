package lv.javaguru.lessons.lesson1.task8;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ruslan on 2016.10.17..
 */
public class CalculateNumberInArray {

    public static void main(String[] args) {
        int arrayLength = getNumberFromUser();
        int[] array = createArray(arrayLength);
        fillArrayWithRandomNumbers(array);
        printArrayToConsole(array);
        int evens = calculateEvenInArray(array);
        int odds = arrayLength - evens;
        printCounters(evens, odds);


    }

    public static int getNumberFromUser() {
        System.out.println("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        if (userNumber <= 0) {
            getNumberFromUser();
        }
        return userNumber;
    }

    public static int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    public static void fillArrayWithRandomNumbers(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(101);
        }
    }

    public static int calculateEvenInArray(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void printCounters(int evenCounter, int oddCounter) {
        System.out.println("Count of evens in array: " + evenCounter);
        System.out.println("Count of odds in array: " + oddCounter);
    }

    public static void printArrayToConsole(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
