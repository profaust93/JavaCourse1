package lv.javaguru.lessons.lesson1.task9;

import java.util.Random;
import java.util.Scanner;

public class SwapFirstAndGreatestNumber {
    public static void main(String[] args) {
        int length = getArrayLengthFromUser();
        int[] array = createArray(length);
        fillArrayWithRandomNumbers(array);
        printArray(array);
        swapFirstAndGreatest(array);
        printArray(array);


    }

    private static int getArrayLengthFromUser(){
        System.out.println("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        return length;
    }

    private static int[] createArray(int length){
        int[] array = new int[length];
        return array;
    }

    private static void fillArrayWithRandomNumbers(int[] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }
    }

    private static void swapFirstAndGreatest(int[] array){
        int greatestNumber = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > greatestNumber){
                greatestNumber = array[i];
                position = i;
            }
        }
        swap(array,position);

    }

    private static void swap(int[] array, int positionGrNumber){
        int temp = array[0];
        array[0] = array[positionGrNumber];
        array[positionGrNumber] = temp;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
