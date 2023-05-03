package ru.itmo.lessons.lesson21.task01;

public class Task01 {
    public static void main(String[] args) {
        // Задание №1
        // пищевая ценность продукта создается со следующими обязательными свойствами:
        // количество калорий
        // остальные свойства являются необязательными:
        // количество в граммах (по умолчанию, 100)
        // белки (по умолчанию, -1)
        // жиры (по умолчанию, -1)
        // углеводы (по умолчанию, -1)

        // Логика создания экземпляров пищевой ценности должна быть описана в классе Builder

        // Пример использования:
        NutritionFacts avocado = new NutritionFacts.Builder(160)
                .fats(15)
                .build(); // приводит к созданию экземпляра NutritionFacts (пищевая ценность продукта)

        NutritionFacts milk = new NutritionFacts.Builder(82)
                .servings(200)
                .fats(2)
                .proteins(4)
                .carbs(12)
                .build(); // приводит к созданию экземпляра NutritionFacts (пищевая ценность продукта)
    }
}