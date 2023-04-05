package ru.itmo.lessons.lesson07.properties;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла:");
        String filename = scanner.nextLine();

        // если в разных участках программы нужно в зависимости от расширения файла
        // создавать объекты разных класов, то получится дублирования кода
        // данный код будет в нескольких классах
        // участки кода с проверкой условия и созданием объекта размещать в коде
        // считается некорректным и правильно их выносить в отдельные методы (фабричные, статические методы)
        // поэтому переносим данный участок  кода в отдельный метод getInstance класса Handler

        /*
        Handler handler = null;
        if (filename.endsWith(".json")) { // если файл с расширением .json, то будет создавать объект класса JsonHandler
            handler = new JsonHandler(filename);
        } else {
            handler = new TxtHandler(filename); // если файл с расширением .txt, то будет создавать объект класса TxtHandler
        }
        */

        //
        Handler handler = Handler.getInstance(filename);
        handler.read();
        handler.write();
    }
}
