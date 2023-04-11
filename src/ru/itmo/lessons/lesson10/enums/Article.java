package ru.itmo.lessons.lesson10.enums;

public class Article {
    private String name;
    private Country country;
    // ... остальные свойства не определяем
    public Article(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setCountry() {
        this.country = country;
    }

    public Country getCountry(Country country) {
        return country;
    }
}