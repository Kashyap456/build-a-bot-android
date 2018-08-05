

package com.example.chatu.examplenavview;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;



public class MainActivity extends AppCompatActivity {

    public  MenuItem item;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        public void switchTohome() {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_home, new home()).commit();
            View fragment_home = findViewById(R.id.fragment_home);
            fragment_home.setVisibility(View.VISIBLE);
            View fragment_sessions = findViewById(R.id.fragment_sessions);
            fragment_sessions.setVisibility(View.INVISIBLE);
            View fragment_gameday = findViewById(R.id.fragment_gameday);
            fragment_gameday.setVisibility(View.INVISIBLE);
            View fragment_contact = findViewById(R.id.fragment_contact);
            fragment_contact.setVisibility(View.INVISIBLE);
        }

        public void switchTosessions() {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_sessions, new sessions()).commit();
            View fragment_sessions = findViewById(R.id.fragment_sessions);
            fragment_sessions.setVisibility(View.VISIBLE);
            View fragment_home = findViewById(R.id.fragment_home);
            fragment_home.setVisibility(View.INVISIBLE);
            View fragment_gameday = findViewById(R.id.fragment_gameday);
            fragment_gameday.setVisibility(View.INVISIBLE);
            View fragment_contact = findViewById(R.id.fragment_contact);
            fragment_contact.setVisibility(View.INVISIBLE);
        }

        public void switchTogameday() {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_gameday, new gameday()).commit();
            View fragment_gameday = findViewById(R.id.fragment_gameday);
            fragment_gameday.setVisibility(View.VISIBLE);
            View fragment_sessions = findViewById(R.id.fragment_sessions);
            fragment_sessions.setVisibility(View.INVISIBLE);
            View fragment_home = findViewById(R.id.fragment_home);
            fragment_home.setVisibility(View.INVISIBLE);
            View fragment_contact = findViewById(R.id.fragment_contact);
            fragment_contact.setVisibility(View.INVISIBLE);
        }

        public void switchTocontact() {
            FragmentManager manager = getSupportFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_contact, new contact()).commit();
            View fragment_contact = findViewById(R.id.fragment_contact);
            fragment_contact.setVisibility(View.VISIBLE);
            View fragment_sessions = findViewById(R.id.fragment_sessions);
            fragment_sessions.setVisibility(View.INVISIBLE);
            View fragment_gameday = findViewById(R.id.fragment_gameday);
            fragment_gameday.setVisibility(View.INVISIBLE);
            View fragment_home = findViewById(R.id.fragment_home);
            fragment_home.setVisibility(View.INVISIBLE);
        }

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    switchTohome();
                    return true;

                case R.id.navigation_sessions:
                    switchTosessions();
                    return true;

                case R.id.navigation_gameday:
                    switchTogameday();
                    return true;
                case R.id.navigation_contact:
                    switchTocontact();
                    return true;

            }
            return false;
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        View fragment_sessions = findViewById(R.id.fragment_sessions);
        fragment_sessions.setVisibility(View.INVISIBLE);
        View fragment_gameday = findViewById(R.id.fragment_gameday);
        fragment_gameday.setVisibility(View.GONE);
        View fragment_contact = findViewById(R.id.fragment_contact);
        fragment_contact.setVisibility(View.GONE);

    }



}