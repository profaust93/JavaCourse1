package lv.javaguru.lessons.lesson1.task10;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ruslan on 2016.10.17..
 */
public class BubbleSort {
    public static void main(String[] args) {
        int length = getArrayLengthFromUser();
        int[] array = createArray(length);
        fillArrayWithRandomNumbers(array);
        printArray(array);
        bubbleSort(array);
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

    private static void swap(int[] array, int coordFirstNum,int coordSecondNum){
        int temp = array[coordFirstNum];
        array[coordFirstNum] = array[coordSecondNum];
        array[coordSecondNum] = temp;
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] array){
        boolean isSwaped = true;
        while(isSwaped) {
            isSwaped = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    swap(array,i,i+1);
                    isSwaped = true;
                }
            }
        }
    }
}
