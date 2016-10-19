package lv.javaguru.lessons.lesson1.task15;

import java.util.ArrayList;
import java.util.List;

public class Queens {

    public static List<Integer[][]> listOfFields = new ArrayList<>();

    public static void main(String[] args) {
        int[][] field = createField();
        fillFieldByZeros(field);
        /*
        field[3][5] = 1;
        System.out.println("Queen in row: " + isQueenInRow(field, 3));
        System.out.println("Queen in column: " + isQueenInColumn(field, 5));
        System.out.println("Queen in cell: " + isQueenOnCell(field[3][5]));
        System.out.println("Start row coord: " + getStartRowCoord(3, 5));
        System.out.println("Start column coord: " + getStartColumnCoord(3, 5));
        System.out.println("Queen in up diagonal: " + isQueenInUpDiagonal(field, 3, 5));
        System.out.println("Queen in down diagonal: " + isQueenInDownDiagonal(field, 3, 5));
        System.out.println("Is free to put: " + isFreeToPut(field, 3, 5));
        */
        putQueen(field);


    }

    public static int[][] createField() {
        int[][] array = new int[8][8];
        return array;
    }

    public static void fillFieldByZeros(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 0;
            }
        }

    }

    public static boolean isQueenInRow(int[][] field, int rowNumber) {
        for (int i = 0; i < field.length; i++) {
            if (field[rowNumber][i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isQueenInColumn(int[][] field, int columnNumber) {
        for (int i = 0; i < field[columnNumber].length; i++) {
            if (field[i][columnNumber] == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean isQueenInDiagonal(boolean upDiagonal, boolean downDiagonal) {
        if (upDiagonal || downDiagonal) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isQueenInUpDiagonal(int[][] field, int rowNumber, int columnNumber) {
        int startRowCoord = getStartRowCoord(rowNumber, columnNumber);
        int startColumnCoord = getStartColumnCoord(rowNumber, columnNumber);
        while (true) {
            if (startRowCoord == field[startRowCoord].length - 1 || startColumnCoord == field[startRowCoord].length-1) {
                return false;
            }
            if (isQueenOnCell(field[startRowCoord][startColumnCoord])) {
                return true;
            }
            startRowCoord++;
            startColumnCoord++;
        }
    }

    public static boolean isQueenInDownDiagonal(int[][] field, int rowNumber, int columnNumber) {
        int sum = rowNumber + columnNumber;
        int point;
        int startRowCoord;
        int startColumnCoord;
        if(sum > field[rowNumber].length - 1){
            point = field[rowNumber].length - 1 - rowNumber;
        } else {
            point = columnNumber;
        }
        startRowCoord = rowNumber + point;
        startColumnCoord = columnNumber - point;

        while (true) {
            if (isQueenOnCell(field[startRowCoord][startColumnCoord])) {
                return true;
            }
            if(startRowCoord > 0){
                startRowCoord--;
            }
            startColumnCoord++;
            if (startColumnCoord == field[startColumnCoord].length - 1) {
                return false;
            }
        }
    }

    public static int getStartRowCoord(int rowNumber, int columnNumber) {
        if (rowNumber > columnNumber) {
            return rowNumber - columnNumber;
        } else {
            return 0;
        }
    }

    public static int getStartColumnCoord(int rowNumber, int columnNumber) {
        if (columnNumber > rowNumber) {
            return columnNumber - rowNumber;
        } else {
            return 0;
        }
    }

    public static boolean isQueenOnCell(int cellState) {
        if (cellState == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void putQueen(int[][] field) {
        int row = 0;
        int column = 0;
        boolean changeState = false;
        while(true){
            if(listOfFields.size() > 0 && listOfFields.get(0).equals(field)){
                break;
            }
            column=0;
            while (!isComplete(field)){
                if(changeState){
                    column = 0;
                    while (changeState) {

                        if (column == field[row].length-1 && !isFreeToPut(field,row,column)){
                            if( row != 0) {
                                row--;
                            }
                            column = 0;
                        }
                        if(field[row][column] == 1){
                            field[row][column] = 0;
                            changeState = false;
                            System.out.println("Changing state on: " + changeState);
                        } else {
                            column++;
                        }

                    }
                }

                if (column == field[row].length-1 && !isFreeToPut(field,row,column)){
                    if( row != 0) {
                        row--;
                    }
                    changeState = true;
                    column = 0;
                    System.out.println("Changing state on: " + changeState);
                }
                if (isFreeToPut(field,row,column)){
                    System.out.println("Putting Queen on: " + row + " : " + column);
                    field[row][column] = 1;
                    row++;
                    column = 0;
                } else {
                    column++;
                }
            }


        }

    }

    public static boolean isComplete(int[][] field){
        int totalSum = 0;
        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                totalSum = totalSum + field[row][column];
            }
        }
        if (totalSum == 8){
            return true;
        }
        return false;
    }

    public static boolean isFreeToPut(int[][] field, int rowNumber, int columnNumber) {
        boolean upDiagonal = isQueenInUpDiagonal(field, rowNumber, columnNumber);
        boolean downDiagonal = isQueenInDownDiagonal(field, rowNumber, columnNumber);
        if (isQueenInRow(field, rowNumber) || isQueenInColumn(field, columnNumber) || isQueenInDiagonal(upDiagonal, downDiagonal)) {
            return false;
        } else {
            return true;
        }

    }


}
