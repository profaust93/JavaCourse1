package lv.javaguru.lessons.lesson1.task11;

import lv.javaguru.lessons.lesson1.task10.QuickSort;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ruslan on 2016.10.18..
 */
public class BinarySearch {

    public static void main(String[] args) {
        int length = getNumberFromUser();
        int[] array = createArray(length);
        fillArrayWithRandomNumbers(array);
        printArray(array);
        QuickSort.quickSort(array);
        printArray(array);
        int searchingNumber = getNumberFromUser();
        int index = findIndexOf(array,searchingNumber);
        printIndex(index);
    }

    private static void printIndex(int index){
        if (index == -1){
            System.out.println("No number in array");
        } else {
            System.out.println("Index of search number: " + index);
        }
    }

    private static int getNumberFromUser(){
        System.out.println("Enter number: ");
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

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static int findIndexOf(int[] array, int key){
        int left = 0;
        int right = array.length-1;
        while (left < right){
            int mid = (left+right)/2;
            if (key < array[mid]){
                right = mid-1;
            } else if (key > array[mid]){
                left = mid+1;
            } else return mid;

        }
        return -1;
    }
}
