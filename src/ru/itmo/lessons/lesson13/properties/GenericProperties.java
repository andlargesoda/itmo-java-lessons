package ru.itmo.lessons.lesson13.properties;

public class GenericProperties {
    public static void main(String[] args) {
        User<String> stringUser = new User<>(); // тип Object
        stringUser.setId("asdf"); // компилятор проверяет на String
        stringUser.setLogin("qwerty");
        System.out.println(stringUser.getId().toUpperCase()); // компилятор автоматически осуществляет приведение к типу String

        User rawUser = new User(); // сырой тип / необработанный
        // для обратной совме
        stringUser.setId("asdf"); // компилятор проверяет на String
        stringUser.setLogin("qwerty");
        System.out.println(rawUser.getId()); // компилятор автоматически осуществляет приведение к типу String

        Dog dog = new Dog();
        Cat cat = new Cat();
        Kitten kitten = new Kitten();
        Object object01 = new Object();
     }
}
