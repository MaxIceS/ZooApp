package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

public class Dog extends Animal {

    public Dog(String name, Color color, Food food) {
        super(AnimalTypes.Dog, name, color, food);
    }

    @Override
    public String eat() {
        return "кушаю";
    }

}
