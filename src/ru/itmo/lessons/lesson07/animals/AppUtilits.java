package ru.itmo.lessons.lesson07.animals;

public class AppUtilits {

    /*public static int getMin(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }
    */

    // метод, принимающий на вход 2 числа, возращающий минимальный
    public static int getMin(int a, int b) {
        return a > b ? b : a;
    }

    // метод, принимающий на вход 2 строки, возращающий наименьшую по длине
    public static String getMinString(String a, String b) {
        return a.length() > b.length() ? a : b;
    }

    // метод, принимающий на вход 2 числа (min, max) и возвращающий случайное от мин до макс
    public static int getRangeMinMax(int a, int b) {
        return (int) ((Math.random() * (b - a) + a));
    }
}
