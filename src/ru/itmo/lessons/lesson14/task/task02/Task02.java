package ru.itmo.lessons.lesson14.task.task02;

import ru.itmo.lessons.lesson10.enums.Priority;

import java.util.*;

public class Task02 {
    public static void countEachPriority(List<Message> messageList) {
        // Подсчитать количество сообщений для каждого приоритета (Ответ в консоль)
        // FIXME:
        //  1. Объявить массив, в котором можно хранить количество повторений.
        int[] repeatMessage;
        //  Размер массива равен количеству элементов перечисления MessagePriority
        repeatMessage = new int[4];
        //  2. Перебрать список messageList и на каждой итерации цикла:
        for (Message message : messageList) {
            int i;
            //     2.1. получить значение свойства priority элемента коллекции (вызовом метода метод getPriority у элемента коллекции)
            //     2.2. у полученного в п.2.1 приоритета получить его индекс в перечислении
            //     (метод, который возвращает индекс элемента перечисления найти самостоятельно)
            i = message.getPriority().ordinal();
            //     2.3. по полученному в п.2.2 индексу получить значение элемента массива, объявленного в п.1, и увеличить его значение на 1
            repeatMessage[i] += 1;
        }
        //   3. Массив, объявленный в п.1, вывести в консоль
        System.out.println(Arrays.toString(repeatMessage));
    }

    public static void countEachCode(List<Message> messageList) {
        // Подсчитать количество сообщений для каждого кода сообщения (Ответ в консоль)
        // FIXME:
        //  1. Объявить массив, в котором можно хранить количество повторений. Размер массива равен 10
        int[] repeatMessage = new int[10];
        //  2. Перебрать список messageList и на каждой итерации цикла:
        //     2.1. получить значение свойства code элемента коллекции (вызовом метода метод getCode у элемента коллекции)
        //     2.2. по полученному в п.2.1 коду получить значение элемента массива, объявленного в п.1, и увеличить его значение на 1
        for (Message message : messageList) {
            int i;
            i = message.getCode();
            repeatMessage[i] += 1;
        }
        //   3. Массив, объявленный в п.1, вывести в консоль
        System.out.println(Arrays.toString(repeatMessage));
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // Подсчитать количество уникальных сообщений (Ответ в консоль)
        // FIXME:
        //  1. Выбрать коллекцию, которая позволяет хранить только уникальные элементы
        //  2. Создать экземпляр данной коллекции (объект).
        //  Для создании объекта использовать конструктор, который принимает другую коллекцию, передать в него messageList
        HashSet<Message> hashSet01 = new HashSet<>(messageList);
        //  3. Вывести в консоль размер созданной в п.1 коллекции (метод, который возвращает размер коллекции найти самостоятельно)
        System.out.println(hashSet01.size());
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // вернуть только неповторяющиеся сообщения и в том порядке, в котором они встретились в списке messageList
        // FIXME:
        //  1. Выбрать коллекцию, которая позволяет хранить только уникальные элементы, но в порядке добавления
        //  2. Создать экземпляр данной коллекции (объект).
        //  Для создании объекта использовать конструктор, который принимает другую коллекцию, передать в него messageList
        LinkedHashSet<Message> linkedHashSet01 = new LinkedHashSet<>(messageList);
        //  3. Создать пустой список, в котором будут храниться экземпляры типа Message (ArrayList<Message>)
        //  Для создании объекта использовать конструктор, который принимает другую коллекцию, передать в него коллекцию созданную в п.2
        ArrayList<Message> arrayList01 = new ArrayList<>(linkedHashSet01);
        //  4. Ссылку на список, созданный в п.3 вернуть из метода
        return arrayList01;
    }

    public static void removeEach(List<Message> messageList, Message.MessagePriority inPriority) {
        // удалить из коллекции каждое сообщение с заданным приоритетом (вывод в консоль до удаления и после удаления)
        // FIXME:
        //  1. Вывести список messageList в консоль
        for (Message message : messageList) {
            System.out.println(messageList);
        }
        //  2. Создать итератор (Iterator<Message>) списка messageList (создание итератора смотрели на занятии в файле Lesson14.java)
        Iterator<Message> iterator01 = messageList.iterator();
        //  3. Перебрать список messageList созданным в п.2 итератором (перебор итератором смотрели на занятии в файле Lesson14.java),
        //  на каждой итерации цикла:
        //     3.1. получить значение свойства priority элемента коллекции (вызовом метода метод getPriority у элемента коллекции)
        //     3.2. полученное значение сравнить со значением inPriority, если они равны, удалить элемент коллекции
        //     (удаление итератором смотрели на занятии в файле Lesson14.java)
        while (iterator01.hasNext()) {
        }
        //   4. Вывести список messageList в консоль
    }

    public static void removeOther(List<Message> messageList, Message.MessagePriority priority) {
        // удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет (вывод в консоль до удаления и после удаления)
        // FIXME:
        //  1. Вывести список messageList в консоль
        //  2. Создать итератор (Iterator<Message>) списка messageList (создание итератора смотрели на занятии в файле Lesson14.java)
        //  3. Перебрать список messageList созданным в п.2 итератором (перебор итератором смотрели на занятии в файле Lesson14.java),
        //  на каждой итерации цикла:
        //     3.1. получить значение свойства priority элемента коллекции (вызовом метода метод getPriority у элемента коллекции)
        //     3.2. полученное значение сравнить со значением inPriority, если они не равны, удалить элемент коллекции
        //     (удаление итератором смотрели на занятии в файле Lesson14.java)
        //   3. Вывести список messageList в консоль
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, Message.MessagePriority.HIGH);
        removeOther(messages, Message.MessagePriority.LOW);
    }
}