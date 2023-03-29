package ru.itmo.lessons.lesson07.school;

// extends - Student наследуют свойства и методы класса Person
// В таком случае Student - дочерний класс, Person - родительский класс / суперкласс
// если в родительском классе несколько конструкторов, то нужно вызвать один из них
// доступ к свойствам и методам класса Person осуществляется согласно модификатором доступа
// protected - доступ только в рамках дочернего класса
// отсутствие модификатора (package-private) - доступ осуществляется из текущего, дочернего классов
// и внутри текущего пакета
// если у родителя будет private name,
// то у дочернего класса это свойство физически будет (наследовано), но к нему не достучатся
// множественное наследование классов запрещено, class A extends B, C {} - ошибка
// последовательно наследование разрешено, class A extends B {}, class B extends C {}

// final можно использовать с классами
// если перед классом стоит final, то от такого класса нельзя наследовать
// если есть final class X {}, то class Y extends X {} - ошибка
// у дочернего класса Student наследников быть не может

public final class Student extends Person { // подчеркнуто: если в родительском классе есть конструктор с параметрами
    // и нет дефолтного конструктор, то в дочернем конструктор нужно создать конструктор
    // этот конструктор мб дефолтным или с параметрами
    // если в родительском классе
    private String subject; // изучаемый предмет
    private int level; // уровень знаний
    public Student(String name, String subject) {
        super(name); // вызов конструктора родительского класса
        setSubject(subject);
    }
    public void setSubject(String subject) {
        if (subject == null || subject.length() < 2) {
            throw new IllegalArgumentException("Exception: name.length() < subject.length() < 2");
        }
        this.subject = subject;
    }
    public int getLevel() {
        return level;
    }
}

// Student student = new Student();
// у студента помимо его свойств должны быть еще войства из person и сеттеры и геттеры оттуда
// при использовании extends можем у созданного объекта Student вызвать метод Person из класса setAge и т.д.
