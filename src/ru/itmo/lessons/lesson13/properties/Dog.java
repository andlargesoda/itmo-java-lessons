package ru.itmo.lessons.lesson13.properties;

public class Dog extends Animal implements Serializable{

    private String nameDog;

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public void serial(int serial) {

    }

    @Override
    public void speed(int speed) {

    }
}
