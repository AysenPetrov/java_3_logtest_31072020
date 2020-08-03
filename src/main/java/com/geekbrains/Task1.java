package com.geekbrains;
import java.util.logging.Logger;

public class Task1 {
    private static final Logger logger = Logger.getLogger(Task1.class.getName());

    public static void main(String[] args) {
        final int[] res2 = process(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(res2);
    }

    public static int[] process(int[] arrIn) {
        int[] backArr = new int[2];
        if(arrIn.length == 0) {
            logger.info("В массиве нет элементов");
            return arrIn;
        }
        for (int i = arrIn.length - 3; i >= 0 ; i--) {
            if(arrIn[i] == 4) {
                System.arraycopy(arrIn, (i+1), backArr,0,2);
                return backArr;
            }
        }
        throw new RuntimeException("В массиве нет ни одной 4-ки после которой были бы числа");
    }
}
