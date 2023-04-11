package ru.itmo.lessons.lesson11;

public class App {
    public static void main(String[] args) {
        Point point01 = new Point(12, -33);
        Point point02 = new Point(12, -33);
        // если передаем примитив на вход println, то в консоль выводится значение примитива
        // если передаем ссылочный тип на вход println, то внутри println происходит обращение к объекту и вызывается метод toString
        // out-статическое свойство, т.к. объекта нет
        // println - метод
        // все классы в java наследуеются от класса Object
        // Object - родителський класс, поэтому может использоваться как общий тип, но так не делают, т.к. это неудобно
        // родительский класс Object имеет методы
        System.out.println(point01);
        System.out.println(point02);
        // метод toString вызывает в консоли "ru.itmo.lessons.lesson11.Point@378bf509" = имя класса полное + @ + хэшкод объекта
        // чтобы метод toString работал иначе и выводил другие значения в терминал: переходим в класс, где создан объект
        // ПКМ - Generate-toString()-переопряделяем(@Override)
        Figure figure01 = new Figure(2);
        figure01.addPoint(point01);
        figure01.addPoint(point02);
        System.out.println(figure01);

        System.out.println(point01 == point02);
        System.out.println(point01.equals(point02));
        // метод equals сравнивает ссылки (сссылки на один объект или нет)
        // изначально будет false
        // чтобы был True нужно переопределить метод equals в классе Point
        // true будет после переопределения

        // в классе Object есть метод hashcode()- для хранения в хэшмпаппах
        // в классе Object есть метод Clone()- создает копии объектов
        // при Clone() может быть красное подчеркивание, т.к. у него модификатор доступа Protected
        // следовательно необходимо переопределение метода в классе Point
        // повышаем до public
        // класс должен имплементировать интерфейс Cloneable
        // Cloneable - интерфейс-маркер, т.е. нет методов
        // при вызове метода clone() класс должен обязательно имплементировать интерфейс Cloneable
        // иначе не будет учтен exception из тела переопределенного метода clone в классе Point
        // и копия не будет создана
        Point point02Copy = point02.clone(); // создали копию, т.е. новый объект
        System.out.println(point02Copy.equals(point02)); // true
        System.out.println(point02Copy == point02); // false
    }
}
