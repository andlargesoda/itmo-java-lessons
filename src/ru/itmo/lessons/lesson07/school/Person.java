package ru.itmo.lessons.lesson07.school;

// класс испольщуется только для определения общих свойств и методов - абстрактный класс
// абстрактный класс необходим для запрета создавать экземпляры и возможности создавать абстрактные методы
// нельзя создать экземпляры абстрактного класс
// абстрактный класс может содержать абстрактные методы (без реализации)
// абстрактные методы нужно реализовать во всех дочерних не абстрактных классах
// абстрактные методы в не абстрактных классах быть не могут

abstract public class Person {
    protected String name;
    protected int age;

    public Person(String name) {
        setName(name);
    }

    // если final используется с методами, то такой метод нельзя переопределить в дочернем классе
    // final c аргументами (локальными переменными) означают, что данные можно использовать только
    // для чтения (нельзя изменать значение)
    //
    public final void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("Exception: name.length() < 3");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Exception: age <0");
        }
        this.age = age;
    }

    // абстрактные методы (без реализации, т.е. нет {тело метода})
    // как только у абстрактного метода поставить {}, то он перестает быть абстрактным
    // логику абстрактного метода прописываем в дочерних классах
    abstract public void rest();
}
