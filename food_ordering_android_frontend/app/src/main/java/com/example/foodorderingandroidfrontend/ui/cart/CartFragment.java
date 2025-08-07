package com.example.foodorderingandroidfrontend.ui.cart;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CartFragment extends Fragment {

    // PUBLIC_INTERFACE
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Inflates the Cart screen layout.
         */
        return inflater.inflate(com.example.foodorderingandroidfrontend.R.layout.fragment_cart, container, false);
    }
}
