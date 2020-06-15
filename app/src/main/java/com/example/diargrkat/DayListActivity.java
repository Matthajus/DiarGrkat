package com.example.diargrkat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import java.util.List;

public class DayListActivity extends AppCompatActivity implements DayOnClickListener, NavigationView.OnNavigationItemSelectedListener {

    DayViewModel dayViewModel;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // drawer bar som robil podla toho videa: https://www.youtube.com/watch?v=fGcMLu1GJEc
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        DayListAdapter dayAdapter = new DayListAdapter(this);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(dayAdapter);

        ViewModelProvider.AndroidViewModelFactory viewModelFactory = new ViewModelProvider.AndroidViewModelFactory(getApplication());
        ViewModelProvider viewModelProvider = new ViewModelProvider(this, viewModelFactory);
        dayViewModel = viewModelProvider.get(DayViewModel.class);

        dayViewModel.getDays().observe(this, dayAdapter::submitList);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        boolean firstStart = prefs.getBoolean("firstStart", true);

        if (firstStart)
            writeData();

    }

    // po kliknuti na item v liste sa otvori jeho detail
    @Override
    public void onDayClick(Day day) {
        Intent intent = new Intent(this, DayDetailActivity.class);
        intent.putExtra("day", day);
        startActivity(intent);
    }

    public void writeData() {
        List<Day> list = Data.loadData();
        for (Day day : list)
            dayViewModel.addDay(day);

        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("firstStart", false);
        editor.apply();

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intent1 = new Intent(this, DayListActivity.class);
                startActivity(intent1);
                break;
            case R.id.nav_info:
                Intent intent2 = new Intent(this, InfoActivity.class);
                startActivity(intent2);
                break;
            case R.id.nav_plus:
                Intent intent3 = new Intent(this, MolebenActivity.class);
                startActivity(intent3);
                break;
        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
