package ru.itmo.lessons.lesson12;

import ru.itmo.lessons.lesson06.books.Book;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.io.IOException;
import java.util.jar.JarException;

public class Lesson12 {
    public static void main(String[] args) {
        // Throwable - общий тип данных исключений
        // Throwable имеет 2-х наследниковЖ: Error, Exception

        // Error - программа прерывает работу (сломалась виртуальная машина JVM VirtualMachineError,
        // ошибка нехватки памяти OutIfMemoryError, неизвестные ошибки )
        // Error никак не обрабатываем, т.к. в этом нет смысла

        // Exception - можно обработать
        // Exception делятся на 2 категории:

        // 1. Исключения времени ВЫПОЛНЕНИЯ (наследники RuntimeException)
        // Исключения времени ВЫПОЛНЕНИЯ можно также называть как unchecked,
        // необрабатываемые, неотслеживаемые, неконтролируемые
        // Разработчики могут (по-своему усмотрению) обработать данный тип данных

        // 2. Исключения времени КОМПИЛЯЦИИ (все остальные наследники Exception):
        // checked, обрабатываемые, отслеживаемые, контролируемые
        // Разработчики обязаны обработать данный тип данных

        // throw new ВЫПОЛНЕНИЯ();
        // throw new КОМПИЛЯЦИИ();
        // обрабатываются исключения одинаковым способом

        // Рассмотрим Исключения времени ВЫПОЛНЕНИЯ
        // целочисленное деление на ноль - ошибка
        // (дробное деление на ноль - бесконечность)

        int a = 1;
        int b = 0;
        int res;
        // res = a/b;
        // System.out.println(res);

        // выход за пределы массива
        int[] ints = new int[3];
        // ints[30] = 100; // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(ints));

        //String string = null;
        //if (string.equals("null")) System.out.println("Строка содержит null");

        // приведение типов
        Object objcet = "123";
        String stringObject = (String) objcet;
        System.out.println(stringObject.toUpperCase());
        // Book book = (Book) objcet; // java.lang.ClassCastException
        // book.setTitle("Исключения в Java");

        // Исключения времени компиляции

        // Files.delete(Path.of("file.txt")); // IOException провоцирует подчеркивание delete throw new IOException()

        // Обработка ИСКЛЮЧЕНИЙ любого типа (uchecked/checked)
        /*
        int x = 60, y = 0;
        int result = 0;
        try { // в блок try помещается потенциально опасный код,
            // который может привести к исключению
            result = x / y;
        } catch (ArithmeticException exception) { // catch перехватывает исключение,
            // указанного в нем типа (в данном случае ArithmeticException) и его наследников
            System.out.println(exception.getMessage());
        }
        System.out.println(result);
        */

        // TODO::
        //  1. объявить класс CalculatorException - исключение времени компиляции,
        //  * конструктор должен принимать на вход сообщение и передавать его в соответствующий конструктор родителя
        //  * переопределить метод getMessage на своё усмотрение
        //  2. Объявить класс с набором статических методов:
        //  * plus - возвращает результат сложения положительных чисел,
        //  если числа не положительные необходимо выбросить CalculatorException
        //  * minus - возвращает результат вычитания положительных чисел,
        //  если числа не положительные необходимо выбросить CalculatorException
        //  * random - возвращает случайное число в диапазоне от min до max
        //  3. Вызвать методы в точке входа

        try {
            System.out.println(Operations.minus(-12, 19));
        } catch (CalculatorException e) {
            throw new RuntimeException(e.getMessage(), e);
        }


        // Обработка нескольких типов исключений
        // 1. исользовать несколько блоков Catch (разные типы нужно обрабатывать разными способами)
        // последовательность catch не важна
        try {
            // потенциально опасный код, в случае исключительной ситуации необходимо перехватить
            // ArithmeticException и ClassCastException
        } catch (ArithmeticException exception) {
            System.out.println("Обработка ArithmeticException " + exception.getMessage());
        } catch (ClassCastException exception) {
            System.out.println("Обработка ClassCastException " + exception.getMessage());
        }

        // 2. разные типы исключений нужно обрабатывать одинаковым способом (оператор I)
        try {
            // потенциально опасный код, в случае исключительной ситуации необходимо перехватить
            // ArithmeticException или  ClassCastException, или NullPointerException
        } catch (ArithmeticException | ClassCastException | NullPointerException exception) {
            System.out.println("Обработка ClassCastException или ArithmeticException," +
                    "или NullPointerException" + exception.getMessage());
        }
        // 3. разные типы исключений нужно обработать одинаковым способом (через общего родителя)
        // удобно, что не нужно перечислять, но зависим от родителя
        // и если одного из наследников захотим исключить, то этот способ уже не подойдет
        try {
            // потенциально опасный код, в случае исключительной ситуации необходимо перехватить
            // исключения времени выполнения
        } catch (RuntimeException exception) {
            System.out.println("Обработка Runtime");
        }

        // 4. если требуется кого-исключить, то его нужно указать первым, иначе родитель сразу все перехватит
        try {
            // потенциально опасный код, в случае исключительной ситуации необходимо перехватить
            // исключения времени выполнения
        } catch (ClassCastException exception) {
            System.out.println("Обработка ClassCastException " + exception.getMessage());
        } catch (RuntimeException exception) {
            System.out.println("Обработка остальных RuntimeException " + exception.getMessage());
        }

        // Необязательный блок finally
        // к блокам try catch добавляем блок finally
        try {
            // NullPointerException
        } catch (NullPointerException exception) {
            System.out.println("Обработка NullPointerException " + exception.getMessage());
        } finally { // если catch не может выполнить exception, то программа остановится, но перед этим выполнит инструкции блока finally
            // код выполнится в случае любого исключения, возникшего в блоке try
            // возможность обработки исключения блоком catch не имеет значения
            // используется для инструкций, связанных с закрытием ресурсов
            // может быть заменен на try with resources try() {}, finally при этом не указывается
        }
        Status status01 = Status.FILE_NOT_FOUND;
        Status status02 = Status.ACCESS_DENIED;
        Status status03 = Status.JAR_ERROR;

        // вызываем метод throwException
        try { // блок кода, в котором может произойти исключение
            throwException(status01);
        } catch (AccessDeniedException exception) { // обработка исключения AccessDeniedException
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) { // обработка исключения JarException
            exception.printStackTrace();
        } catch (FileNotFoundException exception) { // обработка исключения FileNotFoundException
            exception.printStackTrace();
        }

        try {
            throwException(status02);
        } catch (AccessDeniedException exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        try {
            throwException(status03);
        } catch (AccessDeniedException exception) {
            throw new RuntimeException(exception.getMessage(), exception);
        } catch (JarException exception) {
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) {
            throw new FileNotFoundException("Файл не найден");
        }
        if (status.equals(Status.ACCESS_DENIED)) {
            throw new AccessDeniedException("Доступ запрещен");
        }
        if (status.equals(Status.JAR_ERROR)) {
            throw new JarException("Ошибка при чтении/записи в JAR файл");
        }
    }
}