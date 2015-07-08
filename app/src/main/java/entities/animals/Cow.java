package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

/**
 * Created by Максимилиан on 08.07.2015.
 */
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
