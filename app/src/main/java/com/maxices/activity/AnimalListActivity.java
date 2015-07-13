package com.maxices.activity;

import android.app.Fragment;

public class AnimalListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new AnimalListFragment();
    }
}
