package com.example.semesteraufgabe;

/**
 * Programmierung 4
 * SS21
 * @author Philine Hörnemann (m28064)
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    //Attribute
    public static final String TAG = "Animals";
    String LOGCAT = "MainActivity";
    private static Spinner country = null;

    /**
     * Activity_Main wird erstellt
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        country = findViewById(R.id.spCountry);
        Log.i(LOGCAT, "MainActivity OnCreate");

    }

    /**
     * onClick Methode vom Button
     * @param view
     */
    public void bn_GoToTabbed(View view) {
        System.out.println("Tabbed");
        Intent intent = new Intent(this, TabbedActivity.class);
        int sendenr=1;
        startActivityForResult(intent, sendenr); //es fehlt die Rückgabe
    }

    /**
     * gibt das ausgewählte Land als String zurück
     * @return ausgewähltes Land als String
     */
    public static String getCountry() {
        String sCountry = (String) country.getSelectedItem();
        return sCountry;
    }



}