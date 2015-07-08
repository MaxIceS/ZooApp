package com.maxices.activity;

import android.app.Fragment;

import java.util.UUID;


public class MainActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
                UUID crimeId = (UUID)getIntent()
                .getSerializableExtra(AnimalFragment.ANIMAL_ID);
        return AnimalFragment.newInstance(crimeId);
    }
}
