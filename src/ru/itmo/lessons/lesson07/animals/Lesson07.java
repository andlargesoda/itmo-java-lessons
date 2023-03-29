package ru.itmo.lessons.lesson07.animals;

public class Lesson07 {
    public static void main(String[] args) {
        Mouse mouse01 = new Mouse(15);
        Cat cat01 = new Cat(12,67);
        Cat cat02 = new Cat(7,42);
        cat01.setName("Igor");
        cat01.catchMouse(mouse01);
        cat02.atack(cat01);
    }
}
