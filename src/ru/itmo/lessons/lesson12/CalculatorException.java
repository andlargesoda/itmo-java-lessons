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

    static void throwException(Status status) throws JarException, FileNotFoundException, AccessDeniedException {
        if (status.equals(Status.FILE_NOT_FOUND)) {
            throw new FileNotFoundException("Файл не найден");
        } else if (status.equals(Status.ACCESS_DENIED)) {
            throw new AccessDeniedException("Доступ запрещен");
        } else if (status.equals(Status.JAR_ERROR)) {
            throw new JarException("Ошибка при чтении/записи в JAR файл");
        }
    }
}

