package LessenJava.Other;

import java.util.Scanner;

/**
 * Конструкция <<Try Catch>>
 */
public class TryCatch {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try {
            System.out.println("Hello");
            nums[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Не существующая ячейка массива");
        }
    }
}
