package ru.itmo.lessons.lesson07.properties;

public class App {
    public static void main(String[] args) {
        String filename = "file.json";
        Handler handler = null;
        if (filename.endsWith(".json")) {
            handler = new JsonHandler(filename);
        } else {
            handler = new TxtHandler(filename);
        }
        handler.read();
        handler.write();
    }
}
