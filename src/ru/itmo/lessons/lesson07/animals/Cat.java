package ru.itmo.lessons.lesson07.animals;

public class Cat {
    private String name = "Безымяный";
    private final int speed;
    private final int weight;
    // массив пойманных мышей, максимум 100
    private final Mouse[] mice; // final в данном случае говорит о том, что свойство не будет ссылаться на другой объект
    // ссылочный тип данных, значение не задано, а значит по умолчанию null
    private int index; // у каждого экземпляра класса Cat по умолчанию есть индекс со значением 0 (для массива)
    private int winner;
    public Cat(int speed, int weight) {
        if (speed < 10) {
            throw new IllegalArgumentException("Exceprtion: speed < 10");
        }
        if (weight < 50) {
            throw new IllegalArgumentException("Exceprtion: weight < 20");
        }
        this.speed = speed; // если проверка скорости прошла успешно, то присваеивается значение скорости
        this.weight = weight; // если проверка скорости прошла успешно, то присваеивается значение веса
        mice = new Mouse[100]; // размер массива можно передавть через конструктор или прописывать жестко
        // коту присваеивается массив на 100 элементов, которые поплняется пойманными мышами
    }

    public void setName(String name) {
        if (name.length() < 6) {
            throw new IllegalArgumentException("Exceprtion: name.length < 6");
        }
        this.name = name;
    }

    // метод ловки мышей по 1-й
    // кот ловит мышь, только, если его скорость выше, чем у мыши
    public void catchMouse(Mouse mouse) { // в () указываем мышь, т.к. ловим мышь
        if (mouse == null) {
            System.out.println("Кот ловит только мышей");
            return;
        }
        if (speed <= mouse.speed) {
            System.out.println(name + " не смогу поймать мышь");
            return; // испльзуется для прерывания работы метода, если условие выполняется
        }
        // mice
        // цикл не используется
        if (index < 100) {
            mice[index] = mouse;
            index++;
        } else {
            System.out.println("В массиве нет мест");
        }

        /* или
        if (mice.length == index) {
            System.out.println("В массиве нет мест");
            return;
        }
        mice[index] = mouse;
        index++;
        */

        // null, null, null
        for (int i = 0; i < mice.length; i++) {
            if (mice[i] == null) {
                mice[i] = mouse;
                return;
            }
        }
    }
    public void atack(Cat enemy) {
        if (enemy == this) { // кот напал сам на себя
            System.out.println("Кот не может напасть сам на себя");
        }
        if (enemy == null) {
            System.out.println("Кот может напасть только на кота");
            return;
        }
        if (weight > enemy.weight) winner++;
        else enemy.winner++;
    }
}
