package ru.itmo.lessons.lesson10.enums;


import javax.swing.*;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Country country01 = Country.UK;
        Country country02 = Country.UK;
        // сравнение элементов перечисления через == или через equals
        System.out.println(country01 == country02); // при сравнении ссылок получим true, т.к. ссылаемся на один объект
        System.out.println(country01 == Country.USA);

        Article article01 = new Article("Путешествие по Британии");
        /*
        System.out.println(article01.getCountry()); // null
        article01.setCountry(Country.UK);
        System.out.println(article01.getCountry() == country01); // true
        article01.setCountry(Country.FRANCE);
        */

        // методы enum
        // получение массива констант, т.е. можем получить ссылку на мссив с элементами перечисления
        // используется метод .values()
        Country[] countries = Country.values();
        System.out.println(Arrays.toString(countries));

        // метод получения индекса элемента перечисления в массиве
        // используется .ordinal()
        System.out.println(Country.FRANCE.ordinal()); // 2

        // перебор массива
        // методы .name() и .toString() по умолчанию возвращают одно и тоже
        // строковое представление объекта (элемента перечисления)
        // Но: метод name нельзя переопределить, а toString() можно
        for (Country country : countries) {
            System.out.println(country.name());
            System.out.println(country.toString());
        }

        // методы equals, hashCode, clone в enum переопределяются

        // обратиться к элементу перечисления можно напрямую
        Priority priority01 = Priority.LOW;
        System.out.println(priority01.getCode());

        // через другую переменную
        System.out.println(Priority.HIGH.getCode());

        // через цикл
        Priority[] priorities = Priority.values();
        for (Priority priority : priorities) {
            System.out.println(priority.getCode());
        }
    }
}
