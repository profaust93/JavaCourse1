package lv.javaguru.lessons.lesson1.task10;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ruslan on 2016.10.17..
 */
public class QuickSort {

    public static void main(String[] args) {
        int length = getArrayLengthFromUser();
        int[] array = createArray(length);
        fillArrayWithRandomNumbers(array);
        printArray(array);
        quickSort(array);
        printArray(array);

    }

    private static int getArrayLengthFromUser() {
        System.out.println("Enter array length: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        return length;
    }

    private static int[] createArray(int length) {
        int[] array = new int[length];
        return array;
    }

    private static void fillArrayWithRandomNumbers(int[] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1000);
        }
    }

    private static void swap(int[] array, int coordFirstNum, int coordSecondNum) {
        int temp = array[coordFirstNum];
        array[coordFirstNum] = array[coordSecondNum];
        array[coordSecondNum] = temp;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] array) {
        int start = 0;
        int end = array.length - 1;
        doSort(array, start, end);
    }

    private static int findLeftIdx(int[] array, int left, int midPoint){
        while (array[left] < midPoint) {
            left++;
        }
        return left;
    }

    private static int findRightIdx(int[] array, int right, int midPoint){
        while (array[right] > midPoint) {
            right--;
        }
        return right;
    }

    private static void doSort(int[] array, int start, int end) {
        int left = start;
        int right = end;
        int mid = (left + right) / 2;
        int midPoint = array[mid];
        while (left <= right) {
            left = findLeftIdx(array,left,midPoint);
            right = findRightIdx(array,right,midPoint);
            if(left <= right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        if(start < right){
            doSort(array, start, right);
        }
        if(left < end){
            doSort(array,left,end);
        }
    }
}
