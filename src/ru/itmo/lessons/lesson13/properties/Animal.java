package ru.itmo.lessons.lesson13.properties;

 abstract public class Animal implements Runnable{
    private String type;

    public void setType(String type) {
        this.type = type;
    }
}
