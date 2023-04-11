package ru.itmo.lessons.lesson11;

import java.util.Arrays;
import java.util.Objects;

public class Figure {
    private final Point[] points; // fianl с сылочными типами - нельзя менять ссылку (свойство ссылается всегда на один массив), а содержимое можно
    private int indexPoint;
    private int sizeArrayPoint;

    public Figure(int sizeArrayPoint) {
        if (sizeArrayPoint < 2) {
            sizeArrayPoint = 2;
        }
        points = new Point[sizeArrayPoint];
    }

    public void addPoint(Point point) {
        if (point == null) {
            System.out.println("null не может быть добавлен в массив");
            return;
        }
        if (points.length == indexPoint) {
            System.out.println("Массив точек заполнен");
            ;
            return;
        }
        points[indexPoint] = point;
        indexPoint++;
    }

    public void getArrays() {
        for (Point point : points) {
            points[indexPoint] = point;
        }
    }

    // переопределили метод toString()
    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    // переопределили метод equals()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return indexPoint == figure.indexPoint && sizeArrayPoint == figure.sizeArrayPoint && Arrays.equals(points, figure.points);
    }

    // при переопределении метода equals переопределяется метод hashCode()
    // возвращает int
    // не является ссылкой на объект в памяти
    // если объект равны по equals, то hashCode() возвращает одинаковые значения
    // если объект разные по equals, то hashCode() может возвращать одинаковые значения - проблема коллизия
    @Override
    public int hashCode() {
        int result = Objects.hash(indexPoint, sizeArrayPoint);
        result = 31 * result + Arrays.hashCode(points);
        return result;
    }

    @Override
    public /*protected*/ Figure /*Object*/ clone() {
        // super.clone() - можно не писать и интерфейс Cloneable не имплементировать и наоборот
        // если пишем, то Cloneable имплементируем
        Figure figure = new Figure(points.length);
        figure.indexPoint = indexPoint;
        // цикл
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) continue;
            figure.points[i] = points[i].clone();
        }
        return figure;
    }
}
