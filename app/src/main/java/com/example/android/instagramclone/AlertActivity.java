package com.example.android.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.instagramclone.Utils.BottomNavBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class AlertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpBottomNavBar();
    }
    private void setUpBottomNavBar() { // We created this so that we can easily use this in our activities, i.e., copy paste coz that's what we do
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavBar);

        BottomNavBarHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavBarHelper.enableNavigation(AlertActivity.this, bottomNavigationViewEx);

    }
}