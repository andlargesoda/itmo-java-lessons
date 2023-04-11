package ru.itmo.lessons.lesson12;

public class Operations {
    public static int plus(int a, int b) throws CalculatorException{
        if (a < 0 || b < 0) {
            throw new CalculatorException("a или b меньше 0");
        }
        int res = a + b;
        System.out.println(res);
        return res;
    }

    public static int minus(int a, int b) throws CalculatorException{
        if (a < 0 || b < 0) {
            throw new CalculatorException("a или b меньше 0");
        }
        int res = a - b;
        System.out.println(res);
        return res;
    }

    public static int random(int min, int max) throws CalculatorException{
        int res = (int) (Math.random() * minus(max,min));
        System.out.println(res);
        return res;
    }
}
