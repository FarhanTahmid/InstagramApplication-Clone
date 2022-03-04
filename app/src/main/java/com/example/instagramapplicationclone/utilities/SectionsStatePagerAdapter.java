package com.example.instagramapplicationclone.utilities;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> fragmentlist=new ArrayList<>();
    private final HashMap<Fragment,Integer>fragments=new HashMap<>();
    private final HashMap<String,Integer>fragmentNumbers=new HashMap<>();
    private final HashMap<Integer,String>fragmentNames=new HashMap<>();


    public SectionsStatePagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }
    public void addFragment(String fragmentName,Fragment fragment){
        fragmentlist.add(fragment);
        fragments.put(fragment,fragmentlist.size()-1);
        fragmentNumbers.put(fragmentName,fragmentlist.size()-1);
        fragmentNames.put(fragmentlist.size()-1,fragmentName);
    }

    public Integer getFragmentNumber(String fragmentName){
        if(fragmentNumbers.containsKey(fragmentName)){
            return fragmentNumbers.get(fragmentName);
        }else{
            return null;
        }
    }
    public Integer getFragmentNumber(Fragment fragment){
        if(fragmentNumbers.containsKey(fragment)){
            return fragmentNumbers.get(fragment);
        }else{
            return null;
        }
    }
    public String getFragmentName(Integer fragmentNumber){
        if(fragmentNames.containsKey(fragmentNumber)){
            return fragmentNames.get(fragmentNumber);
        }else{
            return null;
        }
    }

}
