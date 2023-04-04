package ru.itmo.lessons.lesson07.school;

// Teacher должен наследоваться от класса Person (extends)
// Teacher не должен иметь наследников (используем модификатор final)
// приватные свойства (private)
    // String subject (свойство нельзя изменить (final)),
    // у разных объектов значения могут отличаться (не приравниваем свойство к конкретному значению)
    // и задавать значение можно через конструктор public Teacher(String subject)
    // int level обязательное свойство (значение свойства долджно устанавливаться через констурктор)
    // если конструкторо в классе несколько и есть обязательное свойство, то свойство указывается во всех конструкторах
    // в результате в классе точно не будет конструктора без параметров
    // конструктор имеет вид public Teacher(String subject, int level)

// методы:
// String getSubject;
// int getLevel();

// если в родительском классе есть конструктор с параметрами public Person(String name) и
// нет конструктора без параметров, то конструктор с параметрами
// нужно вызывать в конструкторе дочернего класса super()
// помимо вызова необходимо передать параметры, которые он требует super(name)
// откуда мы будем брать параметры для родительского конструктора не имеет значения, они могут:
// они могут генерироваться в ()
// могут быть жестко прописаны
// передаваться из вне при создании объекта, следовательно, получаем public Teacher(String subject, int level, String name)
// если бы в классе Person был конструктор без параметров, то вызывать не нужно было

public final class Teacher extends Person implements ITeach{ // класс наследуемый Teacher (extends) от Person и не имеет наследников (final)

    private final String subject; // не имеем = значение, чтобы у объектов не были одинаковые значения и final, т.к. не измено
    private int level; // обязательное свойство, поэтому используем конструктор
    public Teacher(String subject, int level, String name) {
        super(name); // чтобы не подчеркивалось красным
        this.subject = subject;
        this.level = level;
    }
    public String getSubject() {
        return subject;
    }
    public int getLevel() {
        return level;
    }
    @Override
    public void setAge(int teacherAge) {
        // super.setAge(ageTeacher);
        if (teacherAge < 25) {
            throw new IllegalArgumentException("Exception: teacherAge < 25");
        }
        this.age = teacherAge;
    }
    @Override
    public void rest() {
        System.out.println("реализация метода rest класса Student");
    }

    // абстрактный интерфейс
    @Override
    public void teach(Ilearn student) {
        // можно вызвать только методы, объявленные в Ilearn
        // default также можно вызватть в Ilearn
        student.defaultLearning();
        student.learn(this.level);
    }
}
