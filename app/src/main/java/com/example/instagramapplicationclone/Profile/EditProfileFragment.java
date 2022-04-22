package com.example.instagramapplicationclone.Profile;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.instagramapplicationclone.R;
import com.example.instagramapplicationclone.utilities.UniversalImageLoader;
import com.nostra13.universalimageloader.core.ImageLoader;

public class EditProfileFragment extends Fragment {
    private ImageView profileImage;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_edit_profile, container, false);
        profileImage=(ImageView) view.findViewById(R.id.profilePicture);
        initImageLoader();
        setProfileImage();
        return view;
    }
    private void initImageLoader(){
        UniversalImageLoader universalImageLoader= new UniversalImageLoader(getActivity());
        ImageLoader.getInstance().init(universalImageLoader.getConfig());
    }
    private void setProfileImage(){
        Log.d("Set Profile Image","Setting Profile Image.");
        String imgURL="www.google.com/url?sa=i&url=https%3A%2F%2Fwww.iconsdb.com%2Fgreen-icons%2Fandroid-6-icon.html&psig=AOvVaw1WTrvxXuq0s9-vUknkpjWw&ust=1650740324437000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCNDYsoitqPcCFQAAAAAdAAAAABAD";
        UniversalImageLoader.setImage(imgURL,profileImage,null,"https://");
    }
}