package com.example.instagramapplicationclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.SectionsStatePagerAdapter;

import java.util.ArrayList;

public class AccountSettings extends AppCompatActivity {
    private Context context=AccountSettings.this;
    private SectionsStatePagerAdapter pagerAdapter;
    private ViewPager viewPager;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
        viewPager=findViewById(R.id.viewContainer);
        relativeLayout=findViewById(R.id.accSetRelLayout1);
        setUpList();
        setupFragments();
        ImageView backArrow=findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void setUpList(){
        ListView listView=findViewById(R.id.listViewAccountSettings);
        ArrayList<String> options=new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));
        ArrayAdapter adapter=new ArrayAdapter(context, android.R.layout.simple_list_item_1,options);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                setViewPager(position);
            }
        });
    }
    private void setViewPager(int fragmentNumber){
        relativeLayout.setVisibility(View.GONE);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setCurrentItem(fragmentNumber);

    }
    private void setupFragments(){
        pagerAdapter=new SectionsStatePagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(getString(R.string.edit_profile), new EditProfileFragment());
        pagerAdapter.addFragment(getString(R.string.sign_out),new SignOutFragment());

    }
}