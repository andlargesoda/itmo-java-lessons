package lesson03;

import java.util.Scanner;
// импорт класса Scanner из папки java > util

public class Lesson03 {
    public static void main(String[] args) {
        // операторы
        // инкремент (++) / декремент (--)
        // инкремент (++) увеличивает значение переменной на 1 и возвращают результат
        // декремент (--) уменьшает значение переменной на 1 и возвращают результат

        int a = 1;

        // постфиксная форма, т.е. сначала возвращает значение, потом увеличивает
        System.out.println(a++); // 1 вернули
        System.out.println(a); // 2 увеличили 1 до 2

        // префиксная форма, т.е. сначала увеличивает, а потом возвращает значение
        a = 1;
        System.out.println(++a); // 2 увеличили 1 до 2
        System.out.println(a); // вернули 2

        System.out.println(a--); // 1 вернули
        System.out.println(a); // 0 уменьшили 1 до 0

        // префиксная форма, т.е. сначала увеличивает, а потом возвращает значение
        a = 1;
        System.out.println(--a); // 0 уменьшили 1 до 0
        System.out.println(a); // 0 вернули 0

        // аналоги инкремента (++) / декремента (--)
        a += 1; // увеиличили на 1 и вернули результат
        a -= 1; // уменьшили на 1 и вернули результат
        a = a + 1; // увеиличили на 1 и вернули результат
        a = a - 1; // уменьшили на 1 и вернули результат

        // получение данных из консоли
        // пользовательский ввод
        // не забыть про import java.util.Scanner; (см. выше)

        Scanner in = new Scanner(System.in); // Scanner - тип данных, in - имя переменной, new Scanner() - значение переменной
        System.out.println("Введите целое число");
        int userNumber = in.nextInt();
        System.out.println(userNumber);

        int printsCount = 5;
        while (printsCount > 0) {
            System.out.println("+++++");
            printsCount--;
        }

        // ни одной итерации в цикле while
        /*
        boolean isActive=false;
        while (isActive) {
            System.out.println("Программа запущена");
        }
         */
        // бесконечный цикл while
        /*
        boolean isActive=true;
        while (isActive) { // бесконечный цикл
            System.out.println("Программа запущена");
        }
         */

        /*while (true) { // бесконечный цикл while
            System.out.println("Введите целое положительное" + " число или 0 для выхода из программы");
            userNumber = in.nextInt();
            if (userNumber == 0) {
                break; // выход из текущего цикла (прерывается тот цикл, в котором break находится)
            }
            if (userNumber < 0) { // else if здесь не используется, т.к. если в предыдущем условии пользователь введет 0, то программа выйдет из цикла и данное условие проверяться не будет
                continue; // переход на следующую итерацию цикла, т.е. в начало цикла while
            }
            // инструкции будут выполнены, если пользователь введет положительное число
            System.out.println(userNumber * userNumber);
        }
         */

        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите число тарелок");
        int numberOfPlates = taskScanner.nextInt();
        System.out.println("Введите кол-во моющего средства");
        double amountOfDetergent = taskScanner.nextDouble();

        while (amountOfDetergent >= 0.5 && numberOfPlates > 0) {
            numberOfPlates--;
            amountOfDetergent -=0.5;
            System.out.println(numberOfPlates);
            System.out.println(amountOfDetergent);
        }
        System.out.println("Осталось тарелок " + numberOfPlates);
        System.out.println("Осталось моющего средства " + amountOfDetergent);

        for (int number = 30; number >= 0; number = number - 5) {
            System.out.println(number);
        }
        /*
        loop01: // циклам можно давать имя
        while () {
            if () break;
            loop02:
            while () {
                if () break /*loop02*/; // break позволяет выйти из текущего цикла
               // if () break loop01; // по имени цикоа можно выйти из внешнего цикла
            //}
        // }
    }
}
