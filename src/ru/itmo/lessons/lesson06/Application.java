package ru.itmo.lessons.lesson06;

import ru.itmo.lessons.lesson06.books.Author;
import ru.itmo.lessons.lesson06.books.Book;

public class Application {
    public static void main(String[] args) {
            // любая папка внутри папки с исходным кодом src - пакет
            // Имя пакета:
            // доменное имя компании наоборот + имя проекта
            // имя автора + имя проекта
            // ru.itmo.lessons
            // ru.itmo.lessons.lesson06
            // class Application находится в пакете ru.itmo.lessons.lesson06
            // полное имя класса: имя пакета + имя класса, т.е. ru.itmo.lessons.lesson06.Application
            // ru.itmo.lessons (префиксный) нужен, чтобы избежать конфликта имен
            // маленькие пакеты для структурирования
            // имя пакета одним словом, не практике не принято использовать верхний регистр и _

        // объект типа (данные) Author
        // экземпляр класса Author
        // объект класса Author
        Author author01 = new Author();
        // обращение к свойствам
        author01.name = "Mike";
        author01.surname = "Vazovsky";

        Author author02 = new Author();
        author02.name = "Ralph";
        author02.surname = "Ralphovich";
        System.out.println(author01.name + " " + author02.name);

        // вызов метода
        String author01FullName = author01.getFullName(); // String
        System.out.println(author01FullName);

        author01.printFullName(); // void - не возвращает

        Book book01 = new Book(); // объект имеет два свойства Author и title

        // book01.title = "Java 19";
        // book01.author = "Java 19";
        book01.setTitle("");
        book01.setAuthor(author01);
        System.out.println();
        Author bookauthor = book01.getAuthor();
    }
}
