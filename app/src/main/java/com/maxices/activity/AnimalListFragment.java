package com.maxices.activity;

import android.os.Bundle;
import android.view.*;
import java.util.ArrayList;

import android.app.ListFragment;
import android.widget.*;

import android.content.Intent;

import entities.animals.Animal;

public class AnimalListFragment extends ListFragment {

    private ArrayList<Animal> mAnimals = AnimalGenerator.get().getAnimals();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AnimalAdapter adapter = new AnimalAdapter(mAnimals);
        setListAdapter(adapter);
    }

    private class AnimalAdapter extends ArrayAdapter<Animal> {
        public AnimalAdapter(ArrayList<Animal> animal) {
            super(getActivity(), 0, animal);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater().inflate(R.layout.list_item_listtt, null);
            }
            Animal animal = getItem(position);
            TextView titleTextView =(TextView)convertView.findViewById(R.id.crime_list_item_titleTextView);
            titleTextView.setText(animal.getType().toString());
            TextView infaTextView =(TextView)convertView.findViewById(R.id.crime_list_item_infaTextView);
            infaTextView.setText(animal.getName().toString());
            return convertView;
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AnimalAdapter)getListAdapter()).notifyDataSetChanged();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Animal animal = ((Animal)getListAdapter().getItem(position));
        Toast toast = Toast.makeText(getActivity(), animal.getName(), Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(getActivity(), MainActivity.class);
        intent.putExtra(AnimalFragment.ANIMAL_ID, animal.getGuid());
        startActivity(intent);
    }
}
