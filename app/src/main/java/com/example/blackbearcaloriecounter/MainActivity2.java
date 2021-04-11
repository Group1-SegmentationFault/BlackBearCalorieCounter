package com.example.blackbearcaloriecounter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()){
                        case R.id.home_icon:
                            selectedFragment = new HomeFragment();
                            break;
                        case R.id.calorie_icon:
                            selectedFragment = new CaloriesFragment();
                            break;
                        case R.id.settings_icon:
                            selectedFragment = new SettingsFragment();
                            break;


                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.bottom_navigation,
                            selectedFragment).commit();

                    return true;
                }
            };


}