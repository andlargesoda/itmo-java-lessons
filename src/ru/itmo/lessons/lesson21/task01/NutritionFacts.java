package ru.itmo.lessons.lesson21.task01;

public class NutritionFacts {
    private int calories; // калории
    private int servings; // граммы
    private int proteins; // белки
    private int fats; // жиры
    private int carbs; // углеводы

    private NutritionFacts(Builder builder) {
        calories = builder.calories;
        servings = builder.servings;
        proteins = builder.proteins;
        fats = builder.fats;
        carbs = builder.carbs;
    }

    // Builder - public, чтобы мы могли использовать из вне, если бы он был private, то смогли обратиться только из NutritionFacts
    public static class Builder { // static, чтобы создавать без экземпляра, Builder создает объект внешнего класса
        private int calories; // калории
        private int servings = 100; // граммы
        private int proteins = -1; // белки
        private int fats = -1; // жиры
        private int carbs = -1; // углеводы

        public Builder(int calories) {
            this.calories = calories;
        }

        // методы
        // возвращают тип данныхBuilder
        public Builder servings(int value) {
            servings = value;
            return this;
        }

        public Builder proteins(int value) {
            proteins = value;
            return this;
        }

        public Builder fats(int value) {
            fats = value;
            return this;
        }

        public Builder carbs(int value) {
            carbs = value;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}