package lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        // использование var возможно, начиная с java 10
        // при использовании var нужно сразу указывать значение
        var version01 = 10; // целое число всегда int
        var version02 = 10L; // всегда long
        var connected = true; // boolean
        var balance = 4000.8; // float double
        var weight = 50.5F; // float
        var price = (short) 290; // short byte определяется явным представлением

        // арифметические операторы
        int start = 10;
        start -= 10; // start = start -10; 20
        start += 50; // 70
        start *= 100; // 7000
        start /= 10; // 700
        start %= 10; // 0
        System.out.println(start);

        // операторы сравнения
        int a = 50, b = 90, c = 50;
        boolean result = a < b;
        System.out.println(result);
        result = a != c;
        System.out.println(result);
        result = a == c;
        System.out.println(result);
        result = a >= c;
        System.out.println(result);
        result = a <= b;
        System.out.println(result);

        // логические операторы
        // логические операторы работают только с 2-мя операндами, не более
        // && и
        // || или
        // ! не

        // тернарный оператор ?
        // переменная х = выражение ? выражение1:выражение2;
        int sum01 = 100001;
        double discount = 0.1;
        double sum02 = sum01 > 100000 ? (sum01 - (sum01 * discount)) : sum01 * 1;
        System.out.println(sum02);

        int age =201;
        int exp = 6;
        if (age > 200 || age < 18) { // чтобы задать диапазон используется оператор и или
            System.out.println("Мы вам перезвоним");
        } else if (exp < 5) {
            System.out.println("Вы подходите на должность младшего разработчика");
        } else {
            System.out.println("Вы подходите на должность старшего разработчика");
        }

        // область видимости переменных ограничивается фигунрными скокбками
    }
}
