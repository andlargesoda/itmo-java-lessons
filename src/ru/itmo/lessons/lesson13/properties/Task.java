package ru.itmo.lessons.lesson13.properties;

public class Task {
    public static <T extends Cat & Eatable> void void01(T object) {

        //в классе можно вызвать методы generic типа и его родителей
        object.hashCode(); // Object
        object.setNameCat("cat"); // cat
        object.eatable(1); // eatable
        object.setType("cat"); // animal
        object.serial(2); // serializable
        object.speed(6); // runnable
    }

    public static <T extends Animal & Serializable> void void02(T object) {

        //в классе можно вызвать методы generic типа и его родителей
        object.hashCode(); // Object
        object.setType("cat"); // animal
        object.serial(2); // serializable
        object.speed(6); // runnable
    }

    public static <T extends Serializable & Runnable> void void03(T object) {

        //в классе можно вызвать методы generic типа и его родителей
        object.hashCode(); // Object
        object.speed(4); // Ru
        object.serial(2); // serializable
    }
}
