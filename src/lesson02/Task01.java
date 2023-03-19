package lesson02;

public class Task01 {
    public static void main(String[] args) {
        int size = 5; // второй раз переменную не объявляют
        size = size * 2; // повторно определен тип переменной

        byte code = 0;
        int isActive = (int) code; // boolean не может быть переведен в другой тип

        float a = 11.7F; //не указали F, т.к. JVM нацелена на работу с double
        long b = 60;
        long result01 = (long) a/b; // одна из переменных с плавающей точкой

        byte x = 10, y = 30;
        int result02 = x * y; // умножение byte всегда дает int, диапазон тут не причем

        double n = 20.7;
        float m = -1.6F;
        double result03 = n * m; // double выше float

        int c = 13;
        int res = c % 3;
        System.out.println(res);
    }
}
