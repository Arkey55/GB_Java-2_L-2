package ru.geekbrains.lesson_2;

import ru.geekbrains.lesson_2.exceptions.MyArrayDataException;
import ru.geekbrains.lesson_2.exceptions.ErrorException;
import ru.geekbrains.lesson_2.exceptions.MyArraySizeException;
import ru.geekbrains.lesson_2.util.SumStringArray;

public class Main {

    public static void main(String[] args) {
        String[][] goodArray = {{"7","2","3","9"},
                                {"7","15","1","5"},
                                {"8","1","2","3"},
                                {"3","2","0","7"}};

        String[][] stringsOne ={{"7","2","3","9"},
                                {"7","0","1","5"},
                                {"8","c","2","3"},
                                {"3","2","5","7"}};

        String[][] stringsTwo = {{"7","2","3","9"},
                                 {"7","0","1","5","7"},
                                 {"8","3","2","3"},
                                 {"3","2","5","7"}};
        testArray(goodArray);
//        testArray(stringsOne);
        testArray(stringsTwo);
    }

    private static void testArray (String [][] s){
        try {
            new SumStringArray().doSumUpArray(s);
        } catch (MyArraySizeException e) {
//            System.out.println(e.getMessage());
            throw new ErrorException("Error during array size check.", e);
        } catch (MyArrayDataException e) {
//            System.out.println(e.getMessage());
            throw new ErrorException("Error during array data check.", e);
        }
    }
}
