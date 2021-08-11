package com.example.semesteraufgabe;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

import android.content.Intent;
import android.os.Bundle;

import com.example.semesteraufgabe.ui.main.BigFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.semesteraufgabe.ui.main.SectionsPagerAdapter;

public class TabbedActivity extends AppCompatActivity {

    /**
     * Activity_Tabbed wird erstellt
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
    }

    /**
     * onClick Methode vom Button des BigFragments
     * @param view
     */
    public void bn_GoToThirdBig(View view) {
        System.out.println("Tabbed");
        Intent intent = new Intent(this, ThirdActivity.class);
        int sendenr=1;
        startActivityForResult(intent, sendenr); //es fehlt die Rückgabe
    }

    /**
     * onClick Methode vom Button des LittleFragments
     * @param view
     */
    public void bn_GoToThirdLittle(View view) {
        System.out.println("Tabbed");
        Intent intent = new Intent(this, ThirdActivityLittle.class);
        int sendenr=1;
        startActivityForResult(intent, sendenr); //es fehlt die Rückgabe
    }

    /**
     * onClick Methode vom Button des MiddleFragments
     * @param view
     */
    public void bn_GoToThirdMiddle(View view) {
        System.out.println("Tabbed");
        Intent intent = new Intent(this, ThirdActivityMiddle.class);
        int sendenr=1;
        startActivityForResult(intent, sendenr); //es fehlt die Rückgabe
    }
}