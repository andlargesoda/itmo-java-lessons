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

// final можно использовать с классами, свойствами, методами
// если перед классом стоит final, то от такого класса нельзя наследовать
// если есть final class X {}, то class Y extends X {} - ошибка
// у дочернего класса Student наследников быть не может

// класс Student наслеудется от класса Person
// разрешено наследование одного класса
// класс Student имплементирует интерфейс ILearn
// разрешена имплементация нескольких интефейсов
// все абстрактные методы дб реализованы
// default методы дб переопределены

// для создания объектов можно использовать тип данных классов Student, Person, тип данных интерфейса Ilearn
// тип данных Person и Ilearn можно использовать для хранения объектов в массивах и для передачи данных объектов в методах
// наличие интерфейса в классе гарантирует, что в этом классе будет реализован метод, определенный в интерфейсе
// схожа с общим типом данных родительского класса Person, т.е.:
// если мы как узываем тип данных родителя, то для вызова доступны только методы определенные в этом классе
// если мы указываем тип данных интерфейса, то можно передавать любые объекты класса,
// который комплементирует данный интерфейс, но для вызова будет доступны только методы, объявленные в интерфейсе
// в вызванном методе от интерфейса можно обращаться к свойствам, которые объявлены в текущем классе и родительских классах
// если в интерфейсе(-ах) будет больше абстрактных методов, то нужно написать реализацию всех этих методов в классах, которые имплементирует
// данный интерфейс
public final class Student extends Person implements Ilearn { // подчеркнуто: если в родительском классе есть конструктор с параметрами
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

    // переопределение метода родительского класса, чтобы данный метод по-другому работал в дочернем классе
    // повторяем метод родительского класса
    // модификатор доступа такой же или выше
    // тип возвращаемого значение void, имя метода, тип переменной изменять нельзя
    // имя переменной метода менять можно
    // далее переопределяем
    // можно полностью изменить логику работы методы
    // также можно оставить как есть инструкции и добавить свои
    // для вызова инструкций из метода родителя пишем super.setAge(studentAge)
    // перед переопределенным методом можно (желательно) написать аннотацию @Override (времени компиляции) -
    // после компиляции и во время выполнения программы аннотации
    // видя компилятор понимает, что метод переопределяется
    // @Override позволяет компилятору при переопрделении в случае ошибки сообщить об этом
    @Override // аннотация времени компиляции
    public void setAge(int studentAge) {
        // super setAge(studentAge);
        if (studentAge < 7) {
            throw new IllegalArgumentException("Exception: studentAge < 7");
        }
        this.age = studentAge;
    }

    // абстрактный метод
    @Override // таже причина, что выше
    public void rest() {
        System.out.println("реализация метода rest класса Student");
    }

    public String getSubject() {
        return subject;
    }

    // реализаций абстрактного метода интерфейса Ilearn
    @Override
    public void learn(int level) {
        System.out.println("Студент " + name + " проходит обучение" + " Предмет " + subject);
        this.level = (int) (Math.random() * level);
    }


}

// Student student = new Student();
// у студента помимо его свойств должны быть еще войства из person и сеттеры и геттеры оттуда
// при использовании extends можем у созданного объекта Student вызвать метод Person из класса setAge и т.д.
