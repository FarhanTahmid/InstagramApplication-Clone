package com.example.instagramapplicationclone.Like;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.BottomNavViewOrganiser;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LikesActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_likes_activty);
        setupBottomNavView();
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