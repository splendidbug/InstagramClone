package com.example.android.instagramclone.Utils;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import com.example.android.instagramclone.AddActivity;
import com.example.android.instagramclone.AlertActivity;
import com.example.android.instagramclone.Home;
import com.example.android.instagramclone.ProfileActivity;
import com.example.android.instagramclone.R;
import com.example.android.instagramclone.SearchActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import androidx.annotation.NonNull;

public class BottomNavBarHelper {

public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx)
{
    bottomNavigationViewEx.enableAnimation(false);
    bottomNavigationViewEx.enableItemShiftingMode(false);
    bottomNavigationViewEx.enableShiftingMode(false);
    bottomNavigationViewEx.setTextVisibility(false);
}

public static void enableNavigation(final Context context, BottomNavigationViewEx view){
    view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            switch(menuItem.getItemId()){

                case R.id.house:
                    Intent intent1 = new Intent(context, Home.class);
                    context.startActivity(intent1);    // we have to use context.startActivity because we are in another object class

                    // and it needs to know which context we are referring to

                    break;

                case R.id.add:
                    Intent intent2 = new Intent(context, AddActivity.class);
                    context.startActivity(intent2);
                    break;
                case R.id.search:
                    Intent intent3 = new Intent(context, SearchActivity.class);
                    context.startActivity(intent3);
                    break;
                case R.id.alert:
                    Intent intent4 = new Intent(context, AlertActivity.class);
                    context.startActivity(intent4);
                    break;

                case R.id.profile:
                    Intent intent5 = new Intent(context, ProfileActivity.class);
                    context.startActivity(intent5);
                    break;
            }

            return false;
        }
    });
}
}


