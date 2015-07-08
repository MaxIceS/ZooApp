package com.maxices.activity;

import android.os.Bundle;
import android.view.*;
import java.util.ArrayList;

import android.app.ListFragment;
import android.widget.*;

import android.content.Intent;

import entities.animals.Animal;


public class AnimalListFragment extends ListFragment {

    private ArrayList<Animal> animals = AnimalGenerator.get().getAnimals();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.nazva);
        ListttAdapter adapter = new ListttAdapter(animals);
        setListAdapter(adapter);

    }

    private class ListttAdapter extends ArrayAdapter<Animal> {
        public ListttAdapter(ArrayList<Animal> listtt) {
            super(getActivity(), 0, listtt);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getActivity().getLayoutInflater()
                        .inflate(R.layout.list_item_listtt, null);
            }
            Animal c = getItem(position);

            TextView titleTextView =
                    (TextView)convertView.findViewById(R.id.crime_list_item_titleTextView);
            titleTextView.setText(c.getType().toString());


            TextView infaTextView =
                    (TextView)convertView.findViewById(R.id.crime_list_item_infaTextView);
            infaTextView.setText(c.getName().toString());

            return convertView;
        }
    }


    @Override
    public void onResume() {
        super.onResume();
        ((ListttAdapter)getListAdapter()).notifyDataSetChanged();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Animal c = ((Animal)getListAdapter().getItem(position));
        Toast toast = Toast.makeText(getActivity(),
                c.getName() + " was clicked", Toast.LENGTH_SHORT);
        toast.show();
        Intent i = new Intent(getActivity(), MainActivity.class);
        i.putExtra(AnimalFragment.EXTRA_CRIME_ID, c.getGuid());
        startActivity(i);
    }
}
