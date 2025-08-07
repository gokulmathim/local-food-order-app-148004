package com.example.foodorderingandroidfrontend;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;

import com.example.foodorderingandroidfrontend.ui.home.HomeFragment;
import com.example.foodorderingandroidfrontend.ui.restaurants.RestaurantsFragment;
import com.example.foodorderingandroidfrontend.ui.cart.CartFragment;
import com.example.foodorderingandroidfrontend.ui.orders.OrdersFragment;
import com.example.foodorderingandroidfrontend.ui.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    // PUBLIC_INTERFACE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * MainActivity: Entry point for the food ordering Android app.
         * Initializes the bottom navigation and sets up fragment navigation.
         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setBackgroundColor(getResources().getColor(R.color.bottom_nav_background, getTheme()));
        navView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    loadFragment(new HomeFragment());
                    return true;
                case R.id.navigation_restaurants:
                    loadFragment(new RestaurantsFragment());
                    return true;
                case R.id.navigation_cart:
                    loadFragment(new CartFragment());
                    return true;
                case R.id.navigation_orders:
                    loadFragment(new OrdersFragment());
                    return true;
                case R.id.navigation_profile:
                    loadFragment(new ProfileFragment());
                    return true;
            }
            return false;
        });

        // Set default fragment
        navView.setSelectedItemId(R.id.navigation_home);
    }

    // PUBLIC_INTERFACE
    private void loadFragment(Fragment fragment) {
        /**
         * Replaces the current fragment with the given fragment.
         * @param fragment - Fragment to display
         */
        fragmentManager.beginTransaction()
                .replace(R.id.nav_host_fragment, fragment)
                .commit();
    }
}
