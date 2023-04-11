package ru.itmo.lessons.lesson10.enums;

public enum Operation {
    SUM{
        @Override
        public int action(int a, int b) {
            return a + b;
        }
    },
    MULTI {
        @Override
        public int action(int a, int b) {
            return a * b;
        }
    };


    // в перечислении можно объявлять абстрактные методы без реализации
    // абстрактные методы реализуются для каждого элемента перечисления отдельно
    // но его логика необходимо расписать, т.к. он абстрактный, поэтому логика можно отличаться
    // вызов SUM.action
    public abstract int action(int a, int b);
}
