package entities.animals;

import java.util.UUID;

import entities.AnimalTypes;
import entities.Color;
import entities.Food;

public abstract class Animal {

    public UUID getGuid() {
        return guid;
    }
    private UUID guid;
    private String name;
    private Color color;
    private Food food;
    private AnimalTypes type;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public AnimalTypes getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Animal(AnimalTypes type, String name, Color color,Food food){
        this.type = type;
        this.name = name;
        this.color = color;
        this.food = food;
        this.guid = UUID.randomUUID();
    }

    public boolean isMonochrome(){
        return true;
    }

    public abstract String eat();
}
