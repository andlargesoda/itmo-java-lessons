package ru.itmo.lessons.lesson06.books;

// не импортирует Author, т.к. Book и Author в одном пакете books
// Books
public class Book { // ru.itmo.lessons.lesson06.books.book
    // модификатор доступа private, тип данных, имя свойства
    // private - модификатор доступа, доступ к методу осуществляется только внутри текущего класса от { до }
    // свойства делаются приватными для защиты объектов от записи невалидных значений
    // если

    // пусть класс Book хранит информацию о названии книги (String) и иниформацию об авторе (Author)
    private String title; // св-во
    private Author author; // свойство, не импортирует Author, т.к. Book и Author в одном пакете books
    public Book() {
        System.out.println("Создается книга");
    }

    public Book(Author author){
        setAuthor(author);
    }

    // методы, установливающие значения для приватных свойств

    // устанавливает значение свойства title
    public void setTitle(String bookTitle) { // можем вызвать метод, т.к. public
        // у метода в () появились данные String bookTitle
        title = bookTitle;
    }

    // устанавливает значение свойства author
    public void setAuthor(Author author) { // метод устан
        if (author == null) {
            throw new IllegalArgumentException("Author не мб null");
        }
        // this - ссылка на текущий объект, для решения конфликта
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
}
