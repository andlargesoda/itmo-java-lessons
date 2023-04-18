package ru.itmo.lessons.lesson13.properties;

public class Cat extends Animal implements Eatable{
    private String nameCat;

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    @Override
    public void speed(int speed) {

    }

    @Override
    public void eatable(int eatable) {

    }

    @Override
    public void serial(int serial) {

    }
}
