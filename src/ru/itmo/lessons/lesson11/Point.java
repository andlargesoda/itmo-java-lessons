package ru.itmo.lessons.lesson11;

import java.util.Objects;

public class Point implements Cloneable{
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // переопределили метод toString()
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    // переопределили метод equals()
    @Override // point01.equals(point02)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false; // устанавливаем this, чтобы ыл point01
        // this.getClass() - ссылка на объект класса, который передается в метод
        // o.getClass() - ссылка на объект класса, который вызывается в метод
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    // переопределили метод clone
    // protected - public
    // тип возвращаем переменной понимжаем до Point c Object, чтобы создавались сразу точки, а не объекты типа Object
    public /*protected*/ Point /*Object*/ clone() {
        // обращаемся к родителю и вызываем его реализацию метода clone()
        try {
            return (Point) super.clone(); // переопреде
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }
}
