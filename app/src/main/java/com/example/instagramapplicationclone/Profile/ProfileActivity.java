package com.example.instagramapplicationclone.Profile;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.BottomNavViewOrganiser;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        //setupBottomNavView();
        toolBarSetup();
    }

    private void toolBarSetup(){
        Toolbar toolbar=findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d("onMenuItemClick","Menu item clicked: "+item);
                switch (item.getItemId()){
                    case R.id.profileMenu:
                        Log.d("on profile item clicked","Navigating to profile preferences");
                }
                return false;
            }
        });
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.profile_menu,menu);
        return true;
    }
}