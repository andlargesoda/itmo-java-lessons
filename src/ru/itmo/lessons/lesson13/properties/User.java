package ru.itmo.lessons.lesson13.properties;

// типизированные (generic) свойства
// без ограничений
// с ограничениями
// чтобы одно или несколько свойств были объявлены как generic тип
// после ИмяКласса ставим<буква(ы)>
// generic тип данных можно использовать в качестве типа данных при объявлении свойства
// generic тип данных может также использоваться в get, set, конструкторах

public class User<T> {
    // тип Т компилируется в Object
    // у свойства id можно вызвать только методы Object (equals, hash) в рамках класса
    private T id;
    private String login;

    public void setId(T id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public T getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }
//    class Admin extends User<String> {} // Admin наследует id String типа
//    class Admin<Т> extends User<T> {} // Admin наследует id generic типа
}
