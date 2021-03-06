package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

public class Fox extends Animal {

    public Fox(String name, Color color, Food food) {
        super(AnimalTypes.Fox, name, color, food);
    }

    @Override
    public String eat() {
        return "кушаю";
    }
}
