package entities.animals;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public class Cat extends Animal {

    public Cat(String name, Color color, Food food) {
        super(AnimalTypes.Cat, name, color, food);
    }

    @Override
    public String eat() {
        return "лакаю";
    }


    @Override
    public boolean isMonochrome(){
        return false;
    }
}
