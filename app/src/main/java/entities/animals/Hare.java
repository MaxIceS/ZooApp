package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public class Hare extends Animal {

    public Hare(String name, Color color, Food food) {

        super(AnimalTypes.Hare, name, color, food);
    }

    @Override
    public String eat() {
        return "ем";
    }


    @Override
    public boolean isMonochrome(){
        return false;
    }
}