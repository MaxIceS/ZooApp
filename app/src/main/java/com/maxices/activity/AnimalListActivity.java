package com.maxices.activity;

import android.app.Fragment;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public class AnimalListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AnimalListFragment();
    }
}
