package com.maxices.activity;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

import entities.animals.Animal;

public class AnimalFragment extends Fragment{

    public static final String ANIMAL_ID = "com.android.animal_id";
    private Animal mCurrentAnimal;
    private TextView mTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UUID animalId = (UUID)getArguments().getSerializable(ANIMAL_ID);
        mCurrentAnimal = AnimalGenerator.get().getAnimal(animalId);
    }

    public static AnimalFragment newInstance(UUID crimeId) {
        Bundle args = new Bundle();
        args.putSerializable(ANIMAL_ID, crimeId);
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
        mTextView = (TextView)v.findViewById(R.id.textView);
        mTextView.setText(generateAnimalText(mCurrentAnimal));
    }

    private String generateAnimalText(Animal animal){
        StringBuilder temp = new StringBuilder(getResources().getString(R.string.hi) + " , " +getResources().getString(R.string.i) + " ");
        temp.append(animal.getType().getTitle());
        if (false == animal.isMonochrome()){
            temp.append(", "+getResources().getString(R.string.color)+ " "+ animal.getColor().newGetColor());
        }
        temp.append(", "+getResources().getString(R.string.me)+" "+getResources().getString(R.string.name) +" "+ animal.getName());
        temp.append(", "+getResources().getString(R.string.i) +" "+animal.eat() + " " + animal.getFood().getFoodName());
        return temp.toString();
    }

}
