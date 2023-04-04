package ru.itmo.lessons.lesson07.school;

public class Lesson07 {
    public static void main(String[] args) {
        Student student01 = new Student("Петров", "биология");
        Teacher teacher01 = new Teacher("физика", 10, "Любовь");

        // реализация логики метода не из родительского класса, а переопределнного
        student01.setAge(8);
        teacher01.setAge(27);

        // Person - абстрактный класс, поэтому экземпляр не создать,
        // но можно вызвать конструктор дочернего класса
        // для вызова доступны только методы и свойства, объявленные в классе Person
        Person student02 = new Student("Иванов", "Литература");
        Person teacher02 = new Teacher("математика", 10, "Нина");

        // если методы переопределены в дочерних классах,
        // то при вызове будет использоваться их реализация
        // для абстрактного метода rest также
        student02.setAge(14);
        teacher02.setAge(31);
        student02.rest();
        teacher02.rest();

        // создание объектов через общий тип данных
        // общий тип данных используется для хранения объектов
        // в массивых, коллекциях и т.д.
        // общий тип данных используется для передачи объектов в методы
        Person[] people = {student01, student02, teacher01, teacher02};
        for (Person person : people) {
            person.rest();
            // (Student)person.
            if (person instanceof Student) { // instanceof вернет true, если person принадлежит типу Student
                // person принадлежит типу Student

                // инструкция (
                System.out.println(((Student)person).getSubject());
            }
        }

        // общий тип данных используется для передачи объектов в методы
        Headmaster headmaster = new Headmaster();
        headmaster.invite(student01);
        headmaster.invite(student02);
        headmaster.invite(teacher01);
        headmaster.invite(teacher02);

        teacher01.teach(student01);
        teacher01.teach(headmaster);
    }
}
