package com.example.instagramapplicationclone.Profile;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.instagramapplicationclone.R;

import java.util.ArrayList;

public class AccountSettings extends AppCompatActivity {
    private Context context=AccountSettings.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_settings);
        setUpList();
    }
    private void setUpList(){
        ListView listView=findViewById(R.id.listViewAccountSettings);
        ArrayList<String> options=new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));
        ArrayAdapter adapter=new ArrayAdapter(context, android.R.layout.simple_list_item_1,options);
        listView.setAdapter(adapter);
    }
}