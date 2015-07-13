package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

public class Cow extends Animal{

    public Cow (String name, Color color, Food food) {
        super(AnimalTypes.Cow, name, color, food);
    }

    @Override
    public String eat() {
        return "кушаю";
    }

    @Override
    public boolean isMonochrome(){
        return false;
    }
}
