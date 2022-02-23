package com.example.instagramapplicationclone.Profile;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.BottomNavViewOrganiser;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setupBottomNavView();
    }

    private void toolBarSetup(){

    }



    /*
     * Setting up the BottomNavigationView
     */
    private void setupBottomNavView(){
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottmNavigationViewBar);
        BottomNavViewOrganiser.setupBottomNavView(bottomNavigationView);
        BottomNavViewOrganiser.navigationItemSelection(getApplicationContext(),bottomNavigationView);
        Menu menu=bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}