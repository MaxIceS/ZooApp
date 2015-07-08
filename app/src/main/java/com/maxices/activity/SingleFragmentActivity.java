package com.maxices.activity;

import android.app.Fragment;
import android.os.Bundle;
import android.app.FragmentManager;
import android.support.v4.app.FragmentActivity;

/**
 * Created by Максимилиан on 08.07.2015.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
    protected abstract Fragment createFragment();
}
