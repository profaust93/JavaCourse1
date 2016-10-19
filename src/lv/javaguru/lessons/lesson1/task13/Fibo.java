package lv.javaguru.lessons.lesson1.task13;

/**
 * Created by Ruslan on 2016.10.18..
 */
public class Fibo {

    public static void main(String[] args) {
        System.out.println(fibo(4));

    }

    private static int fibo(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1 || number == 2){
            return 1;
        }

        return fibo(number-1) + fibo(number -2);
    }

    // 0,1,1,2,3,5,8,13...
}
