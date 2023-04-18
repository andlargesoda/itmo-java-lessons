package ru.itmo.lessons.lesson12;

import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;
import java.util.jar.JarException;

// необход
public class CalculatorException extends Exception {
    public CalculatorException(String message) {
        super(message);
    }

    // конструктором CalculatorException можно пользоваться в блоке Catch
    public CalculatorException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " Будьте внимательны";
    }

    // throws ТипДанных - позволяет обработать исключение времени КОМПИЛЯЦИИ
    // кто вызывает данный метод (в нашем случае throwException) тот и обрабатывает данные исключения (после throws)
    // throws ТипДанных - в методе выбрасывается только исключение времени КОМПИЛЯЦИИ и оно не обработано
    // и там, где будет вызываться метод указанные исключения должны быть обработаны
    // в main не нужно прописывать throws

    // throwException помещаем в блок try
    public static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) {
            throw new FileNotFoundException("Файл не найден");
        } else if (status.equals(Status.ACCESS_DENIED)) {
            throw new AccessDeniedException("Доступ запрещен");
        } else if (status.equals(Status.JAR_ERROR)) {
            throw new JarException("Ошибка при чтении/записи в JAR файл");
        }
    }
}

