package ru.geekbrains.lesson_2.util;

import ru.geekbrains.lesson_2.exceptions.MyArrayDataException;
import ru.geekbrains.lesson_2.exceptions.MyArraySizeException;

public class SumStringArray {

    //уместен ли здесь public static void?
    public void doSumUpArray (String [][] s) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (s.length != 4){
            throw new MyArraySizeException("Unacceptable array length. Array 4x4 expected.");
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i].length != 4) {
                throw new MyArraySizeException("Unacceptable array length. Array 4x4 expected.");
            }
            for (int j = 0; j < s[i].length; j++) {
                if (!s[i][j].matches("-?\\d+")){
                    throw new MyArrayDataException("Error at index [" + i + "][" + j + "]. An array can only include digits!");
                }
                sum = sum + Integer.parseInt(s[i][j]);
            }
        }
        System.out.println(sum);
    }
}
