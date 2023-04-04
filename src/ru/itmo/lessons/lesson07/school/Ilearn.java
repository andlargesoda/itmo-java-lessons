package ru.itmo.lessons.lesson07.school;

// правила именования как для класса
public interface Ilearn {

    // интерфейсы могут содержать константы
    // могут содержать  static методы с реализацией

    // могут содержать методы с реализацией, если они отмечены, как default
    // тип возвращаемого значение может быть любой
    // таких методов может быть сколько угодно
    // ничем не отличается от классического
    default public void defaultLearning() {
        System.out.println("Обучение...");
    }

    // абстрактные методы в интерфейсах (без реализации, т.е. нет {тело метода})
    // как только у абстрактного метода поставить {}, то он перестает быть абстрактным
    // логику абстрактного метода прописываем в имплементируемых не абстрактных классах
    public void learn(int level);

    // нельзя создать экземпляр интерфейса (как у абстрактного класса)
    // интефейс может наследоваться от другого интефейса
    // разрешено множественное наследование интерфейсов
    // interface A extends B, C, X {} - интерфейс А наследуется от интерфейсов B, C, X

}
