package ru.itmo.lessons.Lesson15;

import java.util.*;

public class UserStorage {
    private String key; // ключи - логины пользователей (String)
    private User value; // значения - пользователи (User)
    private HashMap<String, User> users; // с каждым логином ассациируется свой пользователь

    public UserStorage() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        // добавление пользователя в map
        // через исключение
        if (user == null) throw new IllegalArgumentException("user не может быть null");
        // if (user == null) return; второй вариант
        // через класс Objects, в котором есть методы с проверкой и генерацией исключенией
        // Objects.requireNonNull(user, "\"user не может быть null\""); 3-й вариант

        // если пользователь с логином, как у user уже содержится в map users,
        // то пользователь не добавляется (значение не перезаписывать)
        if (!users.containsKey(user.getLogin())) { // определяется хэшкод ключа, затем место кода в таблице и затем сравнивается через equals
            users.put(user.getLogin(), user); // определяется хэшкод ключа, затем добавляется
        }
    }

    public List<User> getUsersByAge(int maxAge) {
        // метод формирует и возвращает список пользователей,
        // возраст которых меньше maxAge

        // задача создать не мап, а список, поэтому используем ArrayList
        ArrayList<User> userArrayList = new ArrayList<>();
        // из исходной мапы берем только те, значения, что меньше maxAge
        for (User user : users.values()) {
            if (user.getAge() < maxAge) {
                userArrayList.add(user);
            }
        }
        return null;
    }

    public Map<Integer, List<User>> getUsersByAge() {
        // метод формирует и возвращает map, где
        // ключи - возраст пользователей,
        // значения - списки пользователей соответствующего возраста
        // если метод возвращает Map, то внутри формируется HashMap
        // тип данных возвраст - int, но его написать нельзя в мэп, т.к. нужен дженерик, поэтому используем Integer
        // вместо User используем ArrayList по той же причине
        HashMap<Integer, List<User>> map = new HashMap<>();
        // map.keySet() - Set ключей
        // перебираем только значения
        // HashMap<String, User> users
        for (User user : users.values()) {
            int ageKey = user.getAge();
            if (map.containsKey(ageKey)) { // проверка наличия ключа
                map.get(ageKey).add(user); // по ключу достаем значение
            } else { // нет ключа - нет значения - создаем значение
                ArrayList<User> userArrayList = new ArrayList<>();
                userArrayList.add(user);
                map.put(ageKey, userArrayList);
            }
        }
        return map;
    }

    public EnumMap<User.Role, Integer> getNumberOfUsersByRole() {
        // метод формирует и возвращает map, где
        // ключи - роли пользователей,
        // значения - количество с соответствующей ролью
        EnumMap<User.Role, Integer> enumMap = new EnumMap<>(User.Role.class);
        for (User user : users.values()) {
            User.Role rolekey = user.getRole();
        }
        return enumMap;
    }

}