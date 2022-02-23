package com.example.instagramapplicationclone.Home;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.BottomNavViewOrganiser;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {
    private static final int ACTIVITY_NUM=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);;
        setupBottomNavView();
        setupViewPager();    }


    /*
    This method is for adding the three things in the top bar
     */
    private void setupViewPager(){
        SectionsPagerAdapter adapter=new SectionsPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new MessagesFragment());
        ViewPager viewPager=findViewById(R.id.viewContainer);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout=findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_instagramicon);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_message);

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