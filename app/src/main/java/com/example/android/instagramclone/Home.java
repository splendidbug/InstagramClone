package com.example.android.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.instagramclone.Utils.BottomNavBarHelper;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class Home extends AppCompatActivity {

    private static final int activity_number = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
            setUpBottomNavBar();



    }

    private void setUpBottomNavBar(){ // We created this so that we can easily use this in our activities, i.e., copy paste coz that's what we do
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavBar);

        BottomNavBarHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavBarHelper.enableNavigation(Home.this, bottomNavigationViewEx);
    //Instead of above code we could have done this:

    //bottomNavigationViewEx.enableAnimation(false);
    //bottomNavigationViewEx.enableItemShiftingMode(false);
    //bottomNavigationViewEx.enableItemShiftingMode(false);
    //bottomNavigationViewEx.setTextVisibility(false);

        // but because we have to use this multiple times, it's better if we create a separate class.


    }

}
