package com.maxices.activity;

import java.util.ArrayList;
import java.util.UUID;

import entities.AnimalTypes;
import entities.AnimalsFactory;
import entities.Color;
import entities.Food;
import entities.animals.Animal;

public class AnimalGenerator {

    private static final int COUNT_ANIMALS = 128;
    private ArrayList<Animal> mAnimals;
    private static AnimalGenerator sInstance;
    public ArrayList<Animal> getAnimals() {
        return mAnimals;
    }

    private AnimalGenerator(){
        mAnimals = new ArrayList<Animal>();
        initializeAnimals();
    }

    private void initializeAnimals(){
        int animalsTypesCount = AnimalTypes.values().length;
        int colorTypesCount = Color.values().length;
        int foodTypesFood = Food.values().length;
        String[] names = {"Барсик", "Шарик", "Юра", "Аркадий", "Владимир", "Аллоизий", "Мурзик"};
        for(int i = 0; i < COUNT_ANIMALS; i++){
            mAnimals.add(AnimalsFactory.Create(AnimalTypes.values()[i % animalsTypesCount],
                    names[i % names.length], Color.values()[i % colorTypesCount], Food.values()[i % foodTypesFood]));
        }
    }

    public static AnimalGenerator get() {
        if (sInstance == null){
            sInstance = new AnimalGenerator();
        }
        return sInstance;
    }

    public Animal getAnimal(UUID id) {
        for (Animal animal : mAnimals) {
            if (animal.getGuid().equals(id))
                return animal;
        }
        return null;
    }
}
