package ru.itmo.lessons.lesson07.school;

public class Headmaster implements Ilearn{

    // директор можно вызвать студента или учителя, но не обоих
    // директор можно вызвать студента и учителя, если используем метод Person
    public void invite(Person person) {
        System.out.println("Директор вызвал " + person.getName());
    }

    @Override
    public void learn(int level) {
        System.out.println("Директор посетил урок. " + "Уровень знаний преподавателя " + level);
    }
}
