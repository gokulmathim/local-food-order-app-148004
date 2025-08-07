package com.example.foodorderingandroidfrontend.ui.restaurants;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class RestaurantsFragment extends Fragment {

    // PUBLIC_INTERFACE
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflates the Restaurants screen layout.
         */
        return inflater.inflate(com.example.foodorderingandroidfrontend.R.layout.fragment_restaurants, container, false);
    }
}
