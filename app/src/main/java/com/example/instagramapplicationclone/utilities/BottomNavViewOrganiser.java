package com.example.instagramapplicationclone.utilities;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.example.instagramapplicationclone.Home.HomeActivity;
import com.example.instagramapplicationclone.Like.LikesActivity;
import com.example.instagramapplicationclone.Profile.ProfileActivity;
import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.Search.SearchActivity;
import com.example.instagramapplicationclone.Share.ShareActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavViewOrganiser  {
    public static void setupBottomNavView(BottomNavigationView bottomNavigationViewEx){

    }
    public static void navigationItemSelection(final Context context, BottomNavigationView view){
        view.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.ic_house:
                        Intent goToHome=new Intent(context, HomeActivity.class);
                        goToHome.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(goToHome);
                        break;
                    case R.id.ic_search:
                        Intent goToSearch=new Intent(context, SearchActivity.class);
                        goToSearch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(goToSearch);
                        break;
                    case R.id.ic_addcircle:
                        Intent goToShare=new Intent(context, ShareActivity.class);
                        goToShare.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(goToShare);
                        break;
                    case R.id.ic_accountcircle:
                        Intent goToProfile=new Intent(context, ProfileActivity.class);
                        goToProfile.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(goToProfile);
                        break;
                    case R.id.ic_alert:
                        Intent goToAlert=new Intent(context, LikesActivity.class);
                        goToAlert.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(goToAlert);
                        break;
                }
                return false;
            }
        });
    }
}
