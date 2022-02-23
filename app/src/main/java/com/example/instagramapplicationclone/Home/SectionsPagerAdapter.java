package com.example.instagramapplicationclone.Home;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;


//Class for adding the fragments for the tabs
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> tabFragments=new ArrayList<>();
    public SectionsPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }
    public void addFragment(Fragment fragment){
        tabFragments.add(fragment);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabFragments.get(position);
    }

    @Override
    public int getCount() {
        return tabFragments.size();
    }

}
