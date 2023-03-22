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
        int start = 30;
        System.out.println(start);
        start -= 10; // start = start -10; 20
        System.out.println(start);
        start += 50; // 70
        System.out.println(start);
        start *= 100; // 7000
        System.out.println(start);
        start /= 10; // 700
        System.out.println(start);
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
        // switch
        byte catWeight = 5;
        switch (catWeight) { // byte / Byte, short / Short, int / Integer, char / Character, enum, String
            case 0:
            case 1:
                System.out.println("100 грамм корма");
                break;
            case 2:
            case 3:
                System.out.println("150 грамм корма");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                System.out.println("200 грамм корма");
                break;
            default: // необязательный блок
                System.out.println("неверный ввод");
        }

        // синтаксис switch в стиле лямбда выражений (java 14)
        switch (catWeight){ // break
            case 0, 1 -> System.out.println("100 грамм корма"); // "," = или
            case 2, 3 -> System.out.println("150 грамм корма");
            case 4, 5, 6, 7 -> System.out.println("200 грамм корма");
            default -> System.out.println("неверный ввод");
        }
        // если результат работы switch хотим сохранить в переменную, то блок default становится обязательным, чтобы хоть какое-то значение было
        int count = switch (catWeight){ // можно использовать switch для сохранения значения в переменную, типы данных должны совпадать
            case 0, 1 -> 100;
            case 2, 3 -> 150; /* но не System.out.println(150) */
            case 4, 5, 6, 7 -> 200;
            default -> 0;
        };
        System.out.println(count);

        count =  switch (catWeight){ // результат работы switch хотим сохранить в переменную count
            case 0, 1 -> { // если инструкций несколько, то используются фигурные скобки
                System.out.println("Результат на 0 - 1 кг: " + 100);
                yield 100; // вернуть результат работы switch, yield используется вместо break 100 при помощие yield сохраняется в переменную count
            }
            case 2, 3 -> {
                System.out.println("Результат на 2 - 3 кг: " + 150);
                yield 150;
            }
            case 4, 5 -> {
                System.out.println("Результат на 4 - 7 кг: " + 200);
                yield 200;
            }
            default -> {
                // обработка ошибки ввода
                yield 0;
            }
        };
        System.out.println(count);

    }
}
