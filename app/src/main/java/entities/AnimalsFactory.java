package entities;

import entities.animals.*;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public class AnimalsFactory {
    public static Animal Create(AnimalTypes type, String name, Color color, Food food){
        Animal result = null;

        switch (type){
            case Dog:
                result = new Dog(name, color, food);
                break;
            case Cat:
                result = new Cat(name, color, food);
                break;
            case Wolf:
                result = new Wolf(name, color, food);
                break;
            case Fox:
                result = new Fox(name, color, food);
                break;
            case Cow:
                result = new Cow(name, color, food);
                break;
            case Hare:
                result = new Hare(name, color, food);
                break;
            case Horse:
                result = new Horse(name, color, food);
                break;
        }

        return result;
    }
}
