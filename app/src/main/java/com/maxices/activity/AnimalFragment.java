package com.maxices.activity;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

import entities.animals.Animal;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public class AnimalFragment extends Fragment{

    public static final String EXTRA_CRIME_ID = "com.android.crime_id";

    private Animal mCurrentAnimal;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        UUID animalId = (UUID)getArguments().getSerializable(EXTRA_CRIME_ID);
        mCurrentAnimal = AnimalGenerator.get().getAnimal(animalId);
    }

    //возвращаю типа изменения в нужную строку
    public static AnimalFragment newInstance(UUID crimeId) {
        Bundle args = new Bundle();
        args.putSerializable(EXTRA_CRIME_ID, crimeId);
        AnimalFragment fragment = new AnimalFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_fragment, parent,false);
        wireTextView(v);
        return v;
    }


    private void wireTextView(View v){
        textView = (TextView)v.findViewById(R.id.textView);
        textView.setText(generateAnimalText(mCurrentAnimal));
    }

    private String generateAnimalText(Animal animal){
        StringBuilder temp = new StringBuilder("Привет, я ");
        temp.append(animal.getType().getTitle());
        if (false == animal.isMonochrome()){
            temp.append(", мой цвет " + animal.getColor().newGetColor());
        }
        temp.append(", меня зовут " + animal.getName());
        temp.append(", я " +  animal.eat() + " " + animal.getFood().getFoodName());

        return temp.toString();
    }

}
