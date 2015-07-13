package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

public class Wolf extends Animal {

    public Wolf(String name, Color color, Food food) {
        super(AnimalTypes.Wolf, name, color, food);
    }

    @Override
    public String eat() {
        return "ем";
    }
}
