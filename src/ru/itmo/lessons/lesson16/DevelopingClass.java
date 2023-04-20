package ru.itmo.lessons.lesson16;

// большинство классов загружаются по требованию
// загрузчики классов ClassLoader используются для загрузки классов
// системный загрузчик Bootstrap ClassLoader (основной, базовый,родитель для других загрузчиков,
// отвечает за загрузку базовых классов (String, ArrayList, Arrays, etc.) java.lang, java.util etc.
// расширений загрузчик Extension ClassLoader (загружает классы, использующие механизм расширений jre/lib/ext)
// пользовательский загрузчик Application ClassLoader (загрузка остальных классов (разработчиков и классы из подключенных нами библиотек)
//
public class DevelopingClass {
    public final static String CLASS_NAME = "Developing Class";
    private int value;
    private final int maxValue;

    static { // static блок

        // инструкции выполняются один раз, когда класс загружается в память
        // можно вызывать static методы, устанавливать значения static свойств

        System.out.println("Класс " + DevelopingClass.CLASS_NAME + " загружен в память. " +
                "Загрузчик " + DevelopingClass.class.getClassLoader().getName());
    }

    public DevelopingClass(int value) {
        this.value = value;
        this.maxValue = value;
    }

    public void plusValue(int value) {
        this.value = Math.min(this.value + value, maxValue);
    }

    public void minusValue(int value) {
        this.value = Math.max(this.value - value, 0);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DevelopingClass{" +
                "value=" + value +
                ", maxValue=" + maxValue +
                '}';
    }

    public static DevelopingClass getDefault() {
        return new DevelopingClass(10);
    }
}