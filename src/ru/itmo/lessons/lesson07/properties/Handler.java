package ru.itmo.lessons.lesson07.properties;

//Можно создать родительский и дочерние классы в одном файле,
// а затем скопировать только дочерние в отдельные файлы с удалением из исходного
// class Handler хранит имя файлы
// из этого файлы осуществляется чтение и в него можно записывать
// если файл с расширением .json, то с с ним работают объекты JsonHandler
// если файл с расширением .txt, то с с ним работают объекты TxtHandler
abstract public class Handler {

    private String fileName;
    // другие свойства и методы

    public Handler(String fileName) {
        this.fileName = fileName;
    }

    abstract public void read();

    abstract public void write();
}

