package ru.itmo.lessons.lesson21.local;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Street {

    private String name;
    private String description;

    public Street(String name) {
        setName(name);
    }

    private void setName(String streetName){
        // класс, создаваемый внутри метода или конструктора - локальный
        // Экземпляр класса может быть создан внутри того же метода, что и класс, но ниже объявления класса.

        class NameValidator {
            public static final String rule = "Название улицы должно быть в списке доступных улиц и состоять минимум из 2 символов";
            private String description = "Проверка названия улицы";

            private List<String> getNamesList(){
                return new ArrayList<>(Arrays.asList("Ленина", "Чайковского", "Цветочная", "Лунная"));
            }

            private boolean isValid(){
                return streetName != null && streetName.length() >= 2 && getNamesList().contains(streetName);
            }

            /* private void getValuesExample(){
                System.out.println(this); // this - ссылка на экземпляр NameValidator - локального / текущего класса
                System.out.println(Street.this); // ссылка на экземпляр Street - внешний класс
                System.out.println(name); // значение свойства name из класса Street
                System.out.println(description); // значение свойства description из класса NameValidator,
                // свойство description, объявленное в локальном классе (NameValidator)
                // оттеняет свойство description, объявленное во внешнем классе (Street)
                System.out.println(Street.this.description); // значение свойства description из класса Street - синтаксис обращение
                к description внешнего класса Street из-за затенения
                // если
            } */
            // свойства внешнего класса доступны для чтения и записи из локального
            // создание локальных классов обусловлено принципами ООП
            // локальный класс доступен только из метода или конструктора, в котором он объявлен

        }


        if (!new NameValidator().isValid()) {
            throw new IllegalArgumentException(NameValidator.rule);
        }

        this.name = streetName;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}