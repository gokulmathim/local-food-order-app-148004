package com.example.foodorderingandroidfrontend.ui.profile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    // PUBLIC_INTERFACE
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflates the Profile screen layout.
         */
        return inflater.inflate(com.example.foodorderingandroidfrontend.R.layout.fragment_profile, container, false);
    }
}
