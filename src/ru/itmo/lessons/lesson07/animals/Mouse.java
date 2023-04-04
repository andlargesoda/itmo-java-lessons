package ru.itmo.lessons.lesson07.animals;

public class Mouse {
    public final int speed;
    public int weight;
    // если свойство устанавливается единожды и не изменится потом, то используем final
    // скорость мыши всегда будет 15 и не изменится
    // значение final свойств задаются через конструктор или при объявлении
    // их нельзя изменить.

    // конструктор создается для выполнения инструкций при создании объекта
    //public Mouse() { // конструктор без параметров в ()-дефолтный конструктр
    public String color;
    public Mouse(int speed) { // если появляется конструктор с параметрами,
        // то дефолтный конструктр переопределяется и больше нельзя использовать
        // если дефолтный конструктр нужен, то мы явно указываем, что он есть
        // в конструкторе можно выполнять любые инструкции
        if (speed < 10) throw new IllegalArgumentException("Exception: speed < 10");
        this.speed = speed;
    }
    public void setColor(String color) {
        this.color = color;
    }
        public static Mouse getMouse() {
        String[] colors = {"черный", "серый", "белый"};
            Mouse mouse = new Mouse((int) (Math.random()*41+10)); // случайное значение от 10 до 50
            mouse.setColor((colors[(int) (Math.random()*colors.length)]));
            return mouse;
        }

}
