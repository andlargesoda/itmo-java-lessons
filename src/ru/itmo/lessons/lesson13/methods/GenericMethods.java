package ru.itmo.lessons.lesson13.methods;

public class GenericMethods {
    // типизированные (generic) методы
    // могут принимать на вход и возвращать generic типы
    // все generic типы существуют на этапе компиляции, во время выполнения программы не существует
    // generic типы появились давно в 5-й версии Java
    // generic типы помогают разработчику и можно обойтись без них, но будет дольше, больше ошибок и неудобнее

    // создаем метод с generic типом T
    // вместо буква T может быть другая буква или их сочетание
    // когда определяется generic тип используется верхний регистр
    //  используются в параметрах и типах возвращаемого значения
    // перед типом возвращаемого значения ставятся <буква(ы)>, чтобы объявить методом типизированным (generic)
    // буква используемая в качестве типа generic типа используется в параметрах
    // если буква одна в generic типе, то при вызове метода типы долджны быть одинкаковыми
    // если букв несколько в generic типе, то при вызове метода типы могут быть разными
    public static <T> boolean inArray(T[] array, T element) { // метод принимает на вход массив и элемент
        // стирание типов (type erasure):
        // 1. generic тип без ограничений (unbounded) компилируется в тип Object, например, T - Object
        // в данном случае Object не используется, т.к. тип массива и элемента могут не совпадать
        // 2. generic тип с ограничениями (bounded) компилируется в тип ограничения

        // у объектов типа T можно вызвать только методы Object
        for (T t : array) {
            if (element.equals(t)) return true;
        }
        return false;
    }

    // объявляем generic тип с ограничениями (bounded) компилируется в тип ограничения
    public static <T extends Number, K extends String> int compareHashCode(T first, K second) {
        // T компилируется в Number
        // K компилируется в String
        // у generic тип с ограничениями можно вызывать методы типа - ограничения и его родителей
        // у объектов типа T (first) можно вызывать методы Number и его родителей
        // у объектов типа K (second) можно вызывать методы String и его родителей
        return Integer.compare(first.hashCode(), second.hashCode());
    }

    // вызываем метод inArray в точке входа программы
    public static void main(String[] args) {

        // объявляем объекты, используемы на входе в метод inArray
        String[] colors = {"blue", "red", "yellow"};
        String color = "black";

        // вызываем метод inArray
        // <String> - говорим компилятору, что при данном вызове метода inArray,
        // тип T - строка и в массив мы передаем строку
        // если же передадим не тот тип данных (не строки), то компилятор сообщит об ошибке приходящих данных
        // при вызове метода <String> в метод можно передать только тип String
        System.out.println(GenericMethods.<String>inArray(colors, color));


        // при вызове метода
        Integer[] integers = {23, 45, 56, 34};
        Integer integer = 23;
        // в метод передаются тип данных NUmber
        // иначе компилятор сообщит об ошибке
        // при вызове метода <Number> в метод можно передать только тип Number и его наследников (Byte, Short, Integer etc.)
        System.out.println(GenericMethods.<Number>inArray(integers, integer));

        // <Number, String> сообщаем компилятору
        // при вызове метода compareHashCode
        // первый generic тип -Number, второй - String
        // если в () будут попадать данные других типов, то компилятор скажет об ошибке

        // при вызове метода public static <T> boolean inArray(T[] array, T element)
        // компилятор гарантирует использование нужного типа данных <String>, <Number> и тд
        // при вызове метода public static boolean inArray(Object[] array, Object element)
        // такой гарантии не будет

        System.out.println(GenericMethods.<Number, String>compareHashCode(12, "12"));
    }
}
